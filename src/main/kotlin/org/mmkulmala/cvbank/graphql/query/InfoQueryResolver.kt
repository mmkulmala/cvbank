package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.EducationDao
import org.mmkulmala.cvbank.dao.EmploymentDao
import org.mmkulmala.cvbank.dao.HistoryDao
import org.mmkulmala.cvbank.dao.InfoDao
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class InfoQueryResolver(
        private val infoDao: InfoDao
): GraphQLQueryResolver {
    fun info(id: String) = infoDao.getInfoById(id)
}