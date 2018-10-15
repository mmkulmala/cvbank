package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import fi.phz.cvbank.dao.InterestDao
import org.springframework.stereotype.Component

/**
 * Created by phz on 13/09/2018.
 */
@Component
class InterestQueryResolver(
        private val interestDao: InterestDao
): GraphQLQueryResolver {
    fun interest(id: String) = interestDao.getInterestById(id)
}