package org.mmkulmala.cvbank.graphql.input

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

data class ReferenceInput(
        val name: String,
        val flavor: String,
        val private: Boolean,
        val contact: List<ReferenceContactInput>
)