package com.shc.org.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 60291 on 8/14/2023.
 */

public class Weather {
    public String status;//成功返回ok，失败返回具体的原因
    public Basic basic;
    public Now now;
    public AQI aqi;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
