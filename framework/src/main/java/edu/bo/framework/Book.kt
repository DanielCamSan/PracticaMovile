package edu.bo.framework

import com.google.gson.annotations.SerializedName
import java.util.*

data class Movie (
    val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("authors") val authors: String,
    @SerializedName("createdDate") val createdDate: Date,
    @SerializedName("category") val category: String
    )



