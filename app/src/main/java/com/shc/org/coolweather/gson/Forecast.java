package com.shc.org.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 60291 on 8/14/2023.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
