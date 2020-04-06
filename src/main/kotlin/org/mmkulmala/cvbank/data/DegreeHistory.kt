package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

@Document(collection = "degreeHistory")
data class DegreeHistory(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val institution: String,
        val title: String,
        val url: String,
        val start: String,
        val end: String,
        val grade: String,
        val summary: String,
        val curriculum: List<String>
)