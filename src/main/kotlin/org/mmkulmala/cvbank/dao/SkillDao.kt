package org.mmkulmala.cvbank.dao

import fi.phz.cvbank.data.Skills
import fi.phz.cvbank.repository.SkillRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class SkillDao(
        private val skillRepository: SkillRepository
) {
    fun getSkillById(id: String) = skillRepository.findById(id)

    fun createSkill(name: String, level: String, keywords: List<String>) =
            skillRepository.save(Skills(name = name, level = level, keywords = keywords))

}