package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.EducationDao
import org.mmkulmala.cvbank.dao.EmploymentDao
import org.mmkulmala.cvbank.dao.HistoryDao
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class HistoryQueryResolver(
        private val historyDao: HistoryDao
): GraphQLQueryResolver {
    fun history(id: String) = historyDao.getHistoryById(id)
}