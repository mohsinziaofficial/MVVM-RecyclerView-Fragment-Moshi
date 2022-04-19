package com.example.mvvmrecyclerviewfragment.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListPriceX(
    @Json(name = "amountInMicros")
    val amountInMicros: Int?,
    @Json(name = "currencyCode")
    val currencyCode: String?
)