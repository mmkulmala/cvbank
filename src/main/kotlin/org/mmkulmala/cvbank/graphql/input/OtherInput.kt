package org.mmkulmala.cvbank.graphql.input

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by Marno Kulmala on 12/09/2018.
 */
data class OtherInput(
        val label: String,
        val flavor: String,
        val value: String
)