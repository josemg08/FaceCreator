package sandbox.josegonzalez.fragmentpaplet.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import sandbox.josegonzalez.fragmentpaplet.FaceCreatorApplication;
import sandbox.josegonzalez.fragmentpaplet.model.AttributeItem;

import sandbox.josegonzalez.fragmentpaplet.R;

/**
 * Created by jose on 17/10/16.
 */

public class AttributeListAdapter extends RecyclerView.Adapter<AttributeListAdapter.MyViewHolder> {

    private List<AttributeItem> attributeItems;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView attributeImageView;
        public TextView itemText;

        public MyViewHolder(View view) {
            super(view);
            attributeImageView = (ImageView) view.findViewById(R.id.item_image);
            itemText = (TextView) view.findViewById(R.id.item_text);
        }
    }

    public AttributeListAdapter(List<AttributeItem> moviesList) {
        this.attributeItems = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attribute_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        AttributeItem attributeItem = attributeItems.get(position);
        holder.attributeImageView.setImageDrawable(FaceCreatorApplication.getContext()
                .getResources().getDrawable(attributeItem.getResourceId()));
        holder.itemText.setText(attributeItem.getItemName());
    }

    @Override
    public int getItemCount() {
        return attributeItems.size();
    }
}