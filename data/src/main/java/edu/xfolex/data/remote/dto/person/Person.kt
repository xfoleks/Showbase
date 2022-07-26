package edu.xfolex.data.remote.dto.person

import com.google.gson.annotations.SerializedName
import edu.xfolex.data.remote.dto.show.Country

data class Person(
    @SerializedName("name")
    val name: String,
    @SerializedName("country")
    val country: Country,
    @SerializedName("birthday")
    val birthday: String,
    @SerializedName("deathday")
    val deathday: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("image")
    val photo: ProfilePhoto,
)
