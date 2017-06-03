package com.i100c.openlib.common.utils;

import android.util.Log;

import com.i100c.openlib.common.BuildConfig;


/**
 * 简单日志类
 * Created by qiujuer
 * on 2016/10/28.
 */
public final class Logger {
    public static boolean DEBUG = BuildConfig.DEBUG;

    public static void d(String tag, String msg) {
        if (DEBUG)
            Log.d(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (DEBUG)
            Log.e(tag, msg);
    }
}
