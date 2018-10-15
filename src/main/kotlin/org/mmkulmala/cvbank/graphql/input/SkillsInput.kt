package org.mmkulmala.cvbank.graphql.input

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by marno kulmala on 12/09/2018.
 */

data class SkillsInput(
        val sets: List<SetInput>,
        val list: List<SkillInput>
)