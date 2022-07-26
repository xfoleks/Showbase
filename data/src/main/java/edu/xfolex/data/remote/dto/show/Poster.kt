package edu.xfolex.data.remote.dto.show

import com.google.gson.annotations.SerializedName

data class Poster(
    @SerializedName("medium")
    val url: String
)