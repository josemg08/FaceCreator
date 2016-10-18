package sandbox.josegonzalez.fragmentpaplet.model;

import android.content.res.Resources;

import sandbox.josegonzalez.fragmentpaplet.FaceCreatorApplication;

/**
 * Created by jose on 17/10/16.
 */

public class AttributeItem {

    private long id;
    private String name;
    private String resource;

    public String getResource(){
        return resource;
    }

    public String getItemName(){
        return name;
    }

    public long getItemId(){
        return id;
    }

    public int getResourceId() {
        Resources resources = FaceCreatorApplication.getContext().getResources();
        return resources.getIdentifier(resource, "drawable", FaceCreatorApplication.getContext().getPackageName());
    }

}
