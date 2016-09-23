package sandbox.josegonzalez.fragmentpaplet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

/**.___
 * Created by jose on 22/09/16.
 __.*/
public class HomeActivity extends AppCompatActivity {

    //.___ running on a tablet or simple device __./
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTwoPane) {
                    FaceContainerFragment fragment = new FaceContainerFragment();
                    getFragmentManager().beginTransaction()
                            .replace(R.id.face_container, fragment)
                            .commit();
                } else {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, FaceCreationActivity.class);

                    context.startActivity(intent);
                }
            }
        });

        /**.___
         * The detail container view will be present only in the
         * large-screen layouts (res/values-w900dp).
         * If this view is present, then the
         * activity should be in two-pane mode.
         __.*/
        if (findViewById(R.id.face_container) != null) {
            mTwoPane = true;
        }
    }

}
//.___ End of HomeActivity __./
