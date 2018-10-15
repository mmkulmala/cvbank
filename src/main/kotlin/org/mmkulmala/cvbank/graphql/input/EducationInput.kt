package fi.phz.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

data class EducationInput(
        val summary: String,
        val level: String,
        val degree: String,
        val history: List<DegreeHistoryInput>
)
