package fi.phz.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 24/09/2018.
 */
data class DegreeHistoryInput (
        val institution: String,
        val title: String,
        val url: String,
        val start: String,
        val end: String,
        val grade: String,
        val summary: String,
        val curriculum: List<String>
)