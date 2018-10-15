package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 12/09/2018.
 */
@Document(collection = "education")
data class Education(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val summary: String,
        val level: String,
        val degree: String,
        val history: List<DegreeHistory>
)