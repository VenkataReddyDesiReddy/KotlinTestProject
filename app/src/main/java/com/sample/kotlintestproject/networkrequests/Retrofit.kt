package com.sample.kotlintestproject.networkrequests

import com.sample.kotlintestproject.responsemodels.WeatherResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    val baseUrl = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=29cfde0bb60c763d75fbb5501f4ed4c3"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            // we need to add converter factory to convert JSON object to Java object
            .build()
    }
}