package edu.xfolex.data.remote.dto.person

import com.google.gson.annotations.SerializedName

data class ProfilePhoto(
    @SerializedName("medium")
    val url: String
)
