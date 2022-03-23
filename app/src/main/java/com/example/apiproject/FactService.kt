package com.example.apiproject

import android.media.Image
import android.widget.ImageView
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FactService {
    @GET("random.json?language=en")
    fun getRandomFact() : String

    @GET("today.json?language=en")
    fun getTodayFact() : String

    @GET("floof/")
    fun getFox() : ImageView

    @GET("floof/")
    fun getFoxUnlimited() : ImageView
}