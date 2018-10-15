package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 12/09/2018.
 */
@Document(collection = "meta")
data class Meta(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val format: String,
        val version: String
)