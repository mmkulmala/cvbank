package org.mmkulmala.cvbank.dao

import org.cvbank.data.Education
import org.cvbank.repository.EducationRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class EducationDao(
        private val educationRepository: EducationRepository
) {
    fun getEducationById(id: String) = educationRepository.findById(id)

    fun createEducation(institution: String, area: String, studyType: String, startDate: String, endDate: String, gpa: String, courses: List<String>) =
            educationRepository.save(Education(institution = institution, area = area, studyType = studyType,
                    startDate = startDate, endDate = endDate, gpa = gpa, courses = courses))

}