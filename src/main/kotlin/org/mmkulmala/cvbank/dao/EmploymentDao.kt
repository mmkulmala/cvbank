package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.Employment
import org.mmkulmala.cvbank.data.History
import org.mmkulmala.cvbank.repository.EmploymentRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class EmploymentDao(
        private val employmentRepository: EmploymentRepository
) {
    fun getEmploymentById(id: String) = employmentRepository.findById(id)

    fun createEmployment(summary: String, history: List<History>) =
            employmentRepository.save(Employment(summary = summary, history = history))

}