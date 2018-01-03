package com.jaja.home.patternlockview;

import android.app.Application;

/**
 * Created by ${Terry} on 2018/1/3.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SharedUtil.init(this);
    }
}
