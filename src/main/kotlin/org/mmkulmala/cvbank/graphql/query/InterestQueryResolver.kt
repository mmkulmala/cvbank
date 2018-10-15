package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.*
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class InterestQueryResolver(
        private val interestDao: InterestDao
): GraphQLQueryResolver {
    fun interest(id: String) = interestDao.getInterestById(id)
}