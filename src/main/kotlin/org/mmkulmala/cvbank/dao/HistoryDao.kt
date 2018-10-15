package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.History
import org.mmkulmala.cvbank.repository.HistoryRepository
import org.springframework.stereotype.Component

@Component
class HistoryDao(
        private val historyRepository: HistoryRepository
) {
    fun getHistoryById(id: String) = historyRepository.findById(id)

    fun createHistory(employer: String, url: String, position: String, summary: String,
                      start: String, end: String, keywords: List<String>, highlights: List<String>) =
            historyRepository.save(History(employer = summary, url = url, position = position, summary = summary,
                    start = start, end = end, keywords = keywords, highlights = highlights))
}