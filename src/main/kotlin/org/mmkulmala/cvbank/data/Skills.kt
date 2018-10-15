package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 12/09/2018.
 */
@Document(collection = "skills")
data class Skills(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val sets: List<Set>,
        val list: List<Skill>
)