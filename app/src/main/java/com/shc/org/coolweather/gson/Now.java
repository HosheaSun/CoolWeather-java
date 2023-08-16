package com.shc.org.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 60291 on 8/14/2023.
 */

public class Now {
    @SerializedName("tmp")//别名
    public String temperature;
    public Cond cond;
    public class Cond{
        @SerializedName("txt")
        public String info;
    }
}
