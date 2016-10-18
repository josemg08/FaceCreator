package sandbox.josegonzalez.fragmentpaplet.data;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import sandbox.josegonzalez.fragmentpaplet.FaceCreatorApplication;
import sandbox.josegonzalez.fragmentpaplet.model.AttributeItem;

public class AttributeParser {

    private List<AttributeItem> attributeItems;

    private static AttributeParser instance;

    public static AttributeParser getInstance() {
        if (instance == null) {
            instance = new AttributeParser();
        }

        return instance;
    }

    private AttributeParser() {
        Gson gson = new Gson();
        String json = null;
        try {
            json = getJson();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Type listType = new TypeToken<ArrayList<AttributeItem>>(){}.getType();

        attributeItems = gson.fromJson(json, listType);
    }

    private String getJson() throws IOException {
        String json = null;
        try {
            InputStream is = FaceCreatorApplication.getContext().getAssets().open("attributes.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return json;
    }

    public List<AttributeItem> getAttributeItems() {
        return attributeItems;
    }
}