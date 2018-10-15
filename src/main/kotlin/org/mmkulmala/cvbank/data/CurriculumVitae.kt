package org.mmkulmala.cvbank.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

/**
 * Created by phz on 08/10/2018.
 */
@Document(collection = "curriculumVitae")
data class CurriculumVitae(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val meta: Meta,
    val info: Info,
    val contact: Contact,
    val location: Location,
    val projects: List<Project>,
    val social: List<Social>,
    val employment: Employment,
    val education: Education,
    val skills: Skills,
    val samples: List<Sample>,
    val references: List<Reference>,
    val languages: List<Language>,
    val interests: List<Interest>

)