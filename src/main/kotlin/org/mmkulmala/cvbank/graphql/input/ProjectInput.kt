package fi.phz.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 24/09/2018.
 */
data class ProjectInput(
        val title: String,
        val category: String,
        val role: String,
        val url: String,
        val start: String,
        val end: String,
        val repo: String,
        val description: String,
        val summary: String,
        val keywords: List<String>,
        val media: List<MediaInput>
)