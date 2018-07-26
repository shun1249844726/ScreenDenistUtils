package com.tuya.smart.screendensityutils;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author xushun
 * @Des:
 * @data 2018/7/26.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    protected Activity mActivity;
    protected Context appContext;
    protected Application mApplication;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        mActivity = this;
        appContext = getApplicationContext();
        mApplication = getApplication();
        setOrientation();
        setContentView(getLayout());
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    public void setOrientation() {
        DensityUtils.setDefault(mActivity);
    }

    protected abstract int getLayout();
}