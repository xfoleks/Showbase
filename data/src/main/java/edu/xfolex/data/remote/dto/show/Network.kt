package edu.xfolex.data.remote.dto.show

import com.google.gson.annotations.SerializedName

data class Network(
    @SerializedName("name")
    val name: String,
    @SerializedName("country")
    val country: Country,
    @SerializedName("officialSite")
    val site: String
)
