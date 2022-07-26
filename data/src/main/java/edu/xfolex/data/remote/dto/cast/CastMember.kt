package edu.xfolex.data.remote.dto.cast

import com.google.gson.annotations.SerializedName
import edu.xfolex.data.remote.dto.character.Character
import edu.xfolex.data.remote.dto.person.Person

data class CastMember(
    @SerializedName("person")
    val person: Person,
    @SerializedName("character")
    val character: Character
)