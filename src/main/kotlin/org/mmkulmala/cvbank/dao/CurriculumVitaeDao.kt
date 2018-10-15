package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.CurriculumVitaeRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class CurriculumVitaeDao(
        private val curriculumVitaeRepository: CurriculumVitaeRepository
) {
    fun getCurriculumVitaeById(id: String) = curriculumVitaeRepository.findById(id)

    fun createCurriculumVitae(name: String, meta: Meta, info: Info, contact: Contact, location: Location, projects: List<Project>,
                              social: List<Social>, employment: Employment, education: Education, skills: Skills, samples: List<Sample>,
                              references: List<Reference>, languages: List<Language>, interests: List<Interest>) =
            curriculumVitaeRepository.save(CurriculumVitae(name = name, meta = meta, info = info, contact = contact, location = location, projects = projects,
                    social = social, employment = employment, education = education, skills = skills, samples = samples,
                    references = references, languages = languages, interests = interests))
}