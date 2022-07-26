package edu.xfolex.data.remote.dto.episodes

import com.google.gson.annotations.SerializedName
import edu.xfolex.data.remote.dto.show.Rating

data class Episode(
    @SerializedName("name")
    val name: String,
    @SerializedName("season")
    val season: Int,
    @SerializedName("number")
    val number: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("rating")
    val rating: Rating,
    @SerializedName("summary")
    val summary: String
)
