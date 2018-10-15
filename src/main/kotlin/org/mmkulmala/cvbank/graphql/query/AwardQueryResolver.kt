package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class AwardQueryResolver(
        private val awardDao: AwardDao
): GraphQLQueryResolver {
    fun award(id: String) = awardDao.getAwardById(id)
}