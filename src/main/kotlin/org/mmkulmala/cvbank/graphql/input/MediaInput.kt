package org.mmkulmala.cvbank.graphql.input

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 24/09/2018.
 */
data class MediaInput(
        val category: String,
        val url: String
)