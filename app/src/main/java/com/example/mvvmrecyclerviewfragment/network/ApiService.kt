package com.example.mvvmrecyclerviewfragment.network

import com.example.mvvmrecyclerviewfragment.booksDataClass.BookResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("volumes")
    fun getAllBooks(@Query("q")query : String) : Call<BookResponse>
}