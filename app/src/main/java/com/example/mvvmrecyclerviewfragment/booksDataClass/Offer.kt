package com.example.mvvmrecyclerviewfragment.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Offer(
    @Json(name = "finskyOfferType")
    val finskyOfferType: Int?,
    @Json(name = "giftable")
    val giftable: Boolean?,
    @Json(name = "listPrice")
    val listPrice: ListPriceX?,
    @Json(name = "retailPrice")
    val retailPrice: RetailPrice?
)