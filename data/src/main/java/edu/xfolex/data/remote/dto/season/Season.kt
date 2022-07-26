package edu.xfolex.data.remote.dto.season

import com.google.gson.annotations.SerializedName

data class Season(
    @SerializedName("number")
    val number: String,
    @SerializedName("episodeOrder")
    val countOfEpisodes: String,
    @SerializedName("premierDate")
    val premierDate: String,
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("network")
    val network: String,
    @SerializedName("image")
    val poster: Poster
)
