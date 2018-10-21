package org.mmkulmala.cvbank.repository

import org.mmkulmala.cvbank.data.CurriculumVitae
import org.mmkulmala.cvbank.data.Skills
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by marno kulmala on 13/09/2018.
 */
@Repository
interface CurriculumVitaeRepository : MongoRepository<CurriculumVitae, String> {
    fun findBySkills(skills: Skills): List<CurriculumVitae>
}