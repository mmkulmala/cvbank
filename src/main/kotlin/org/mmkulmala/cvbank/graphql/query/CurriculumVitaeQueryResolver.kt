package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.CurriculumVitaeDao
import org.mmkulmala.cvbank.data.Set
import org.mmkulmala.cvbank.data.Skill
import org.mmkulmala.cvbank.data.Skills
import org.mmkulmala.cvbank.graphql.input.SkillsInput
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 13/09/2018.
 */
@Component
class CurriculumVitaeQueryResolver(
        private val curriculumVitaeDao: CurriculumVitaeDao
): GraphQLQueryResolver {
    fun curriculumVitae(id: String) = curriculumVitaeDao.getCurriculumVitaeById(id)

    fun curriculumVitaeByName(name: String) = curriculumVitaeDao.getCurriculumVitaeByName(name)

    fun curriculumVitaesBySkills(skills: SkillsInput) = curriculumVitaeDao.getCurriculumVitaeBySkills(
            Skills(sets = skills.sets.map { Set(name = it.name, level = it.level, skills = it.skills) },
                    list = skills.list.map { Skill(name = it.name, summary = it.summary, level = it.level, years = it.years, proof = it.proof) }))
}