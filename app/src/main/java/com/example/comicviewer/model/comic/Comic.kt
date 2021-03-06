package com.example.comicviewer.model.comic


import android.annotation.SuppressLint
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@SuppressLint("ParcelCreator")
@Parcelize
@Entity(tableName = "comic")
data class Comic(


    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("digitalId")
    val digitalId: Int,
    @SerializedName("issueNumber")
    val issueNumber: Int,
    @SerializedName("variantDescription")
    val variantDescription: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("modified")
    val modified: String,
    @SerializedName("isbn")
    val isbn: String,
    @SerializedName("upc")
    val upc: String,
    @SerializedName("diamondCode")
    val diamondCode: String,
    @SerializedName("ean")
    val ean: String,
    @SerializedName("issn")
    val issn: String,
    @SerializedName("format")
    val format: String,
    @SerializedName("pageCount")
    val pageCount: Int,
    @SerializedName("textObjects")
    val textObjects: List<TextObject>,
    @SerializedName("resourceURI")
    val resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    @SerializedName("series")
    val series: Series,
    @SerializedName("variants")
    val variants: List<Variant>,
    @SerializedName("collections")
    val collections: List<ComicSummary>,
    @SerializedName("collectedIssues")
    val collectedIssues: List<ComicSummary>,
    @SerializedName("dates")
    val dates: List<Date>,
    @SerializedName("prices")
    val prices: List<Price>,
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail,
    @SerializedName("images")
    val images: List<Image>,
    @SerializedName("creators")
    val creators: Creators,
    @SerializedName("characters")
    val characters: Characters,
    @SerializedName("stories")
    val stories: Stories,
    @SerializedName("events")
    val events: Events
) : Parcelable