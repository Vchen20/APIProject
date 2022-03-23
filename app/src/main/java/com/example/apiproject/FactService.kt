package com.example.apiproject

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FactService {
    @GET("random.json?language=en")
    fun getRandomFact() : String

    @GET("today.json?language=en")
    fun getTodayFact() : String
}