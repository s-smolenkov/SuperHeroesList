package com.example.homework16

import io.reactivex.Single
import retrofit2.http.GET

interface ApiInterface {

    @GET("/superhero-api/api/all.json")
    fun getSuperheroes():Single<List<Hero>>

}