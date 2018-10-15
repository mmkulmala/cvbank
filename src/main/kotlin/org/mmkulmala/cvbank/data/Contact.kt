package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 12/09/2018.
 */
@Document(collection = "contact")
data class Contact(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val website: String,
        val phone: String,
        val email: String,
        val other: List<Other>
)