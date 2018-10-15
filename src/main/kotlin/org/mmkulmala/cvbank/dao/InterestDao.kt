package org.mmkulmala.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import fi.phz.cvbank.data.*
import fi.phz.cvbank.repository.InterestRepository
import org.springframework.stereotype.Component

@Component
class InterestDao(
        private val interestRepository: InterestRepository
) {
    fun getInterestById(id: String) = interestRepository.findById(id)

    fun createInterest(name: String, summary: String, keywords: List<String>) =
            interestRepository.save(Interest(name = name, summary = summary, keywords = keywords))
}