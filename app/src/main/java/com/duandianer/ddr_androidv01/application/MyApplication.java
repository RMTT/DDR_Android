package com.duandianer.ddr_androidv01.application;

import android.app.Application;
import android.content.Context;

import com.duandianer.ddr_androidv01.widget.fresco.FrescoHelper;

/**
 * Created by Administrator on 12/15/2016.
 */

public class MyApplication extends Application {

    private static MyApplication mApplication;

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        FrescoHelper.init(getApplicationContext());

        mContext = getApplicationContext();
    }

    public static MyApplication getApplication() {
        if (mApplication == null)
            mApplication = new MyApplication();
        return mApplication;
    }

    public static Context getContext() {
        return mContext;
    }
}
