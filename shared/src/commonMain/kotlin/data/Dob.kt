package data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Dob(

    @SerialName("date") var date: String? = null,
    @SerialName("age") var age: Int? = null
)