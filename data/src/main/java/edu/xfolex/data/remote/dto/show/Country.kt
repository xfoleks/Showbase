package edu.xfolex.data.remote.dto.show

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val countryName: String
)
