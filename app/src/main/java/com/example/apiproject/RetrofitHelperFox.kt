package com.example.apiproject

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelperFox {
    val baseURL = "https://randomfox.ca/"

    fun getInstance() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(RetrofitHelper.baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}