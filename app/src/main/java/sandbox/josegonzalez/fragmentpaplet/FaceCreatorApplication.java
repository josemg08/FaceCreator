package sandbox.josegonzalez.fragmentpaplet;

import android.app.Application;
import android.content.Context;

public class FaceCreatorApplication extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }
}
