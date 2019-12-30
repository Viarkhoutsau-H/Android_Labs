package com.example.stormdaily;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private static NetworkService networkService;
    private static Retrofit retrofit;
    private String urlBase = "https://api.openweathermap.org/data/2.5/";


    public NetworkService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(urlBase)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static NetworkService getInstance() {
        if(networkService == null) {
            networkService = new NetworkService();
        }
        return networkService;
    }

    public API jsonGet() {
        return retrofit.create(API.class);
    }

}
