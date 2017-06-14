package com.makemyandroidapp.getme.forecast;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Marcin on 2017-05-19.
 */

public interface ForecastAPI {
    @GET("forecast/{key}/{latitude},{longitude}")
    public Call<Forecast> getForecast(
            @Path("key") String key,
            @Path("latitude") String latitude,
            @Path("longitude") String longitude

    );
}
