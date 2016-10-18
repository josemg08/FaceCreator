package sandbox.josegonzalez.fragmentpaplet.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.NavUtils;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import sandbox.josegonzalez.fragmentpaplet.R;
import sandbox.josegonzalez.fragmentpaplet.data.AttributeParser;

/**.___
 * Created by Jose Gonzalez
 *
 * Argentina Sep 2016
 __.*/
public class FaceCreationActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private AttributeListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_creation);

        /*mRecyclerView = (RecyclerView) findViewById(R.id.recyclerList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.setAdapter(new AttributeListAdapter(AttributeParser.getInstance().getAttributeItems()));*/

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerList);

        mAdapter = new AttributeListAdapter(AttributeParser.getInstance().getAttributeItems());
        /*RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());*/
        mRecyclerView.setAdapter(mAdapter);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO save face
            }
        });*/

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null) {
            FaceContainerFragment fragment = new FaceContainerFragment();
            getFragmentManager().beginTransaction()
                    .add(R.id.face_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            NavUtils.navigateUpTo(this, new Intent(this, HomeActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
//.___ End of FaceCreationActivity __./
