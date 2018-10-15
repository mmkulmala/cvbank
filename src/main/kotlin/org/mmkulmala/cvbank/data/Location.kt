package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 12/09/2018.
 */
@Document(collection = "location")
data class Location(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val address: String,
        val city: String,
        val region: String,
        val code: String,
        val countryCode: String
)