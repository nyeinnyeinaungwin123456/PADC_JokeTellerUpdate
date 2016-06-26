package com.anastatia.pdac_week3exer;

import android.app.Application;
import android.content.Context;

/**
 * Created by Nyein Nyein on 6/23/2016.
 */
public class JokeApplication extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this.getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }


}
