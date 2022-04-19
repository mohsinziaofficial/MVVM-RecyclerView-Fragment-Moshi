package com.example.mvvmrecyclerviewfragment.network

import com.example.mvvmrecyclerviewfragment.booksDataClass.Item
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository {
    val apiService by lazy {
        ApiClient.apiService
    }

    suspend fun getAllDataFromResponse(input : String) : List<Item> {
        return withContext(Dispatchers.IO) {
            val response = apiService.getAllBooks(input).execute()
            response.body()?.items ?: listOf()
        }
    }
}