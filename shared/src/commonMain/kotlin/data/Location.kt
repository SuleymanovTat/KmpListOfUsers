package data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(

    @SerialName("street") var street: Street? = Street(),
    @SerialName("city") var city: String? = null,
    @SerialName("state") var state: String? = null,
    @SerialName("country") var country: String? = null,
    @SerialName("coordinates") var coordinates: Coordinates? = Coordinates(),
    @SerialName("timezone") var timezone: Timezone? = Timezone()

)