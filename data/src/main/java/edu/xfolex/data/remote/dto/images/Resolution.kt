package edu.xfolex.data.remote.dto.images

import com.google.gson.annotations.SerializedName

data class Resolution(
    @SerializedName("original")
    val original: String,
    @SerializedName("medium")
    val medium: String
)

