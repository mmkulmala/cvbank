package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

/**
 * Created by phz on 13/09/2018.
 */
@Component
class BasicsQueryResolver(
        private val basicsDao: BasicsDao
): GraphQLQueryResolver {
    fun basics(id: String) = basicsDao.getBasicsById(id)
}