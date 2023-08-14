package com.shc.org.coolweather.util;

import android.text.TextUtils;
import android.util.Log;

import com.shc.org.coolweather.db.City;
import com.shc.org.coolweather.db.County;
import com.shc.org.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 60291 on 8/12/2023.
 */

public class Utility {
    //解析和处理服务器返回的省级数据
    public static boolean handleProvinceResponse(String response) {
        if(!TextUtils.isEmpty(response)){

            try {
                Log.v("responseCity",response);
                JSONArray allProvinces = new JSONArray(response);
                //数据处理，保存在本地的表中
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();//因为继承了DataSupport;

                }
                return  true;

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }
    public static boolean handleCityResponse(String response, int provinceId) {
        if(!TextUtils.isEmpty(response)){

            try {
                Log.v("responseCity",response);
                JSONArray allCities = new JSONArray(response);
                //数据处理，保存在本地的表中
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObiect = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObiect.getString("name"));
                    city.setCityCode(cityObiect.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();//因为继承了DataSupport;

                }
                return  true;

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }
    public static boolean handleCountyResponse(String response, int cityId) {
        if(!TextUtils.isEmpty(response)){

            try {
                Log.v("responseCounty",response);
                JSONArray allCounties = new JSONArray(response);
                //数据处理，保存在本地的表中
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyObiect = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObiect.getString("name"));
                    county.setWeatherId(countyObiect.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }


}
