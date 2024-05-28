package data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseResultUser(

    @SerialName("results") var results: List<Results> = emptyList(),
    @SerialName("info") var info: Info? = Info()

)