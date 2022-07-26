package edu.xfolex.data.remote.dto.images

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("type")
    val type: String,
    @SerializedName("main")
    val main: Boolean,
    @SerializedName("resolutions")
    val resolution: Resolution
)
