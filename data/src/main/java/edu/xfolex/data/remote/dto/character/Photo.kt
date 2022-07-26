package edu.xfolex.data.remote.dto.character

import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("medium")
    val imageUrl: String
)
