package com.shc.org.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 60291 on 8/14/2023.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
