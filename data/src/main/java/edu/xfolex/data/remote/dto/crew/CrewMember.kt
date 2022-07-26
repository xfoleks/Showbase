package edu.xfolex.data.remote.dto.crew

import com.google.gson.annotations.SerializedName
import edu.xfolex.data.remote.dto.person.Person

data class CrewMember(
    @SerializedName("type")
    val role: String,
    @SerializedName("person")
    val person: Person
)