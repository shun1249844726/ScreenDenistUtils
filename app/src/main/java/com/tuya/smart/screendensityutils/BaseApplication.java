package com.tuya.smart.screendensityutils;

import android.app.Application;

/**
 * @author xushun
 * @Des:
 * @data 2018/7/26.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DensityUtils.setDensity(this);
    }
}