package com.coolweather.android.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Http工具类
 * Created by Switch on 2017/5/24.
 */

public class HttpUtils {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
