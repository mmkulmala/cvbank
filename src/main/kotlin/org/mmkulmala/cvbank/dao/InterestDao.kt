package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.Interest
import org.mmkulmala.cvbank.repository.InterestRepository
import org.springframework.stereotype.Component

@Component
class InterestDao(
        private val interestRepository: InterestRepository
) {
    fun getInterestById(id: String) = interestRepository.findById(id)

    fun createInterest(name: String, summary: String, keywords: List<String>) =
            interestRepository.save(Interest(name = name, summary = summary, keywords = keywords))
}