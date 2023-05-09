package com.sample.kotlintestproject.networkrequests

import android.telecom.Call
import com.sample.kotlintestproject.responsemodels.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET()
    suspend fun getWeatherData() : Response<WeatherResponse>
}