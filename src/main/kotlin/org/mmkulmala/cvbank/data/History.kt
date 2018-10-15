package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 12/09/2018.
 */
@Document(collection = "history")
data class History(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val employer: String,
        val url: String,
        val position: String,
        val summary: String,
        val start: String,
        val end: String,
        val keywords: List<String>,
        val highlights: List<String>
)