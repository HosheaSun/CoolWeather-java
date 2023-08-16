package com.shc.org.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;

/**
 * Created by 60291 on 8/14/2023.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
