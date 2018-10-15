package org.mmkulmala.cvbank.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import fi.phz.cvbank.dao.InterestDao
import fi.phz.cvbank.data.*
import fi.phz.cvbank.graphql.input.InterestInput
import org.springframework.stereotype.Component

@Component
class InterestMutationResolver(
        private val interestDao: InterestDao
) : GraphQLMutationResolver {
    fun createInterest(input: InterestInput) =
            interestDao.createInterest(input.name, input.summary, input.keywords)
}