package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.Set
import org.mmkulmala.cvbank.data.Skill
import org.mmkulmala.cvbank.data.Skills
import org.mmkulmala.cvbank.repository.SkillsRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class SkillsDao(
        private val skillsRepository: SkillsRepository
) {
    fun getSkillsById(id: String) = skillsRepository.findById(id)

    fun createSkillsSet(sets: List<Set>, list: List<Skill>) =
            skillsRepository.save(Skills(sets = sets, list = list))

}