package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

@Document(collection = "interest")
data class Interest(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val name: String,
        val summary: String,
        val keywords: List<String>
)
