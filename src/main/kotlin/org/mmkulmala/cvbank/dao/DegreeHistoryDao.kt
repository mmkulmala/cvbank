package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.DegreeHistoryRepository
import org.springframework.stereotype.Component

@Component
class DegreeHistoryDao(
        private val degreeHistoryRepository: DegreeHistoryRepository
) {
    fun getDegreeHistoryById(id: String) = degreeHistoryRepository.findById(id)

    fun createDegreeHistory(institution: String, title: String, url: String, start: String, end: String,
                       grade: String, summary: String, curriculum: List<String>) =
            degreeHistoryRepository.save(DegreeHistory(institution = institution, title = title, url = url, start = start, end = end,
                    grade = grade, summary = summary, curriculum = curriculum))
}