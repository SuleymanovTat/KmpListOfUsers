package data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Registered(

    @SerialName("date") var date: String? = null,
    @SerialName("age") var age: Int? = null
)