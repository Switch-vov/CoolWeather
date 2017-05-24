package com.coolweather.android.gson;

/**
 * Created by Switch on 2017/5/24.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
