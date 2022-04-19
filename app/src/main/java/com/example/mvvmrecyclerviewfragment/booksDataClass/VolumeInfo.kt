package com.example.mvvmrecyclerviewfragment.booksDataClass


import com.example.mvvmrecyclerviewfragment.booksDataClass.ImageLinks
import com.example.mvvmrecyclerviewfragment.booksDataClass.IndustryIdentifier
import com.example.mvvmrecyclerviewfragment.booksDataClass.PanelizationSummary
import com.example.mvvmrecyclerviewfragment.booksDataClass.ReadingModes
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VolumeInfo(
    @Json(name = "allowAnonLogging")
    val allowAnonLogging: Boolean?,
    @Json(name = "authors")
    val authors: List<String>?,
    @Json(name = "averageRating")
    val averageRating: Double?,
    @Json(name = "canonicalVolumeLink")
    val canonicalVolumeLink: String?,
    @Json(name = "categories")
    val categories: List<String>?,
    @Json(name = "contentVersion")
    val contentVersion: String?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "imageLinks")
    val imageLinks: ImageLinks?,
    @Json(name = "industryIdentifiers")
    val industryIdentifiers: List<IndustryIdentifier>?,
    @Json(name = "infoLink")
    val infoLink: String?,
    @Json(name = "language")
    val language: String?,
    @Json(name = "maturityRating")
    val maturityRating: String?,
    @Json(name = "pageCount")
    val pageCount: Int?,
    @Json(name = "panelizationSummary")
    val panelizationSummary: PanelizationSummary?,
    @Json(name = "previewLink")
    val previewLink: String?,
    @Json(name = "printType")
    val printType: String?,
    @Json(name = "publishedDate")
    val publishedDate: String?,
    @Json(name = "publisher")
    val publisher: String?,
    @Json(name = "ratingsCount")
    val ratingsCount: Int?,
    @Json(name = "readingModes")
    val readingModes: ReadingModes?,
    @Json(name = "subtitle")
    val subtitle: String?,
    @Json(name = "title")
    val title: String?
)