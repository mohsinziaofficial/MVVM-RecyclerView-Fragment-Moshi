package com.example.mvvmrecyclerviewfragment.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiClient {
    val baseUrl = "https://www.googleapis.com/books/v1/"

    val httpClient by lazy {
        OkHttpClient
            .Builder()
            .build()
    }

    val retroInstance by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val apiService by lazy {
        retroInstance.create(ApiService::class.java)
    }
}