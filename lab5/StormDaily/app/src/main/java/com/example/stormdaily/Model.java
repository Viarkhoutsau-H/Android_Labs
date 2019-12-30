package com.example.stormdaily;

import com.google.gson.annotations.SerializedName;

public class Model {
    private ForecastMain main;
    private ForecastCloud clouds;
    private ForecastWind wind;

    @SerializedName("name")
    private String cityName;

    public ForecastCloud getCloud() {
        return clouds;
    }

    public ForecastMain getMain() {
        return main;
    }

    public ForecastWind getWind() {
        return wind;
    }

    public String getCityName() {
        return cityName;
    }
}
