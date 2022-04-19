package com.example.mvvmrecyclerviewfragment.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Epub(
    @Json(name = "acsTokenLink")
    val acsTokenLink: String?,
    @Json(name = "isAvailable")
    val isAvailable: Boolean?
)