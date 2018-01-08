package com.keno.test;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

import static com.blankj.utilcode.util.DeviceUtils.getMacAddress;

/**
 * Created by Administrator on 2018/1/5.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        Utils.getApp();
        getMacAddress();

    }
}
