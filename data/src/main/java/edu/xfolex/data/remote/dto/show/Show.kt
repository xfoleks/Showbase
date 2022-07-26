package edu.xfolex.data.remote.dto.show

import com.google.gson.annotations.SerializedName

data class Show(
    @SerializedName("name")
    val name: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("genres")
    val genres: List<String>,
    @SerializedName("status")
    val status: String,
    @SerializedName("runtime")
    val durationOfEpisode: String,
    @SerializedName("rating")
    val rating: Rating,
    @SerializedName("premiered")
    val premiered: String,
    @SerializedName("ended")
    val ended: String,
    @SerializedName("network")
    val network: Network,
    @SerializedName("summary")
    val summary: String
)
