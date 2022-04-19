package com.example.mvvmrecyclerviewfragment.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IndustryIdentifier(
    @Json(name = "identifier")
    val identifier: String?,
    @Json(name = "type")
    val type: String?
)