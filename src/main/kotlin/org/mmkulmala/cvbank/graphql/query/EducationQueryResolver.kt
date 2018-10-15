package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.EducationDao
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class EducationQueryResolver(
        private val educationDao: EducationDao
): GraphQLQueryResolver {
    fun education(id: String) = educationDao.getEducationById(id)
}