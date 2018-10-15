package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 24/09/2018.
 */
@Document(collection = "sample")
data class Sample(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val title: String,
        val summary: String,
        val url: String,
        val date: String
)