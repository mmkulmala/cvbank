package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.*
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class SkillDao(
        private val skillRepository: SkillRepository
) {
    fun getSkillById(id: String) = skillRepository.findById(id)

    fun createSkill(name: String, summary: String, level: String, years: String, proof: String) =
            skillRepository.save(Skill(name = name, summary = summary, level = level, years = years, proof = proof))

}