package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.Education
import org.mmkulmala.cvbank.repository.EducationRepository
import org.mmkulmala.cvbank.data.DegreeHistory
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class EducationDao(
        private val educationRepository: EducationRepository
) {
    fun getEducationById(id: String) = educationRepository.findById(id)

    fun createEducation(summary: String, level: String, degree: String, history: List<DegreeHistory>) =
            educationRepository.save(Education(summary = summary, level = level, degree = degree, history = history))

}