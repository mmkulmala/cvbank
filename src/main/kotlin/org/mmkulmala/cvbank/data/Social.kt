package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 12/09/2018.
 */
@Document(collection = "social")
data class Social(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val label: String,
        val network: String,
        val user: String,
        val url: String
)