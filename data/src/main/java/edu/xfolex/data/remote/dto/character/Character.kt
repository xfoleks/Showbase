package edu.xfolex.data.remote.dto.character

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val photo: Photo,
    @SerializedName("self")
    val self: Boolean,
    @SerializedName("voice")
    val voice: Boolean,
)
