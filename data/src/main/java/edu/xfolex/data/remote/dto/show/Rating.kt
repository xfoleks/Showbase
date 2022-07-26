package edu.xfolex.data.remote.dto.show

import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("average")
    val rating: String
)