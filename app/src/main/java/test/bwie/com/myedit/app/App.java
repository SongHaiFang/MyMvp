package test.bwie.com.myedit.app;

import android.app.Application;
import android.content.Context;

/**
 * data:2017/11/4 0004.
 * Created by ：宋海防  song on
 */

public class App extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
    public static Context context(){

        return context;
    }
}
