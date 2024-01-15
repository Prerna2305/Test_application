package com.test_application.api

import com.test_application.model.Location
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {
    @GET("current.json")
fun getPopularMovies(@Query("key") api_key : String, @Query("q")  location : String) : Call<Location>
}