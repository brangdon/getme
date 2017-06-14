package com.makemyandroidapp.getme.forecast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Marcin on 2017-05-19.
 */

public class ForecastService {
    public static final String APP_URL = "https://api.darksky.net";
    public static final String APP_KEY = "0d08ec2076d2c711bb701504bbb61358";

    public void loadForecastData(Callback<Forecast> callback, String latitude, String longitude) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(APP_URL).addConverterFactory(GsonConverterFactory.create()).build();

        ForecastAPI service = retrofit.create(ForecastAPI.class);

//        Call<Forecast> call = service.getForecast(APP_KEY, "37.8267", "-122.4233");
        Call<Forecast> call = service.getForecast(APP_KEY, latitude, longitude);

        call.enqueue(callback);
    }


}
