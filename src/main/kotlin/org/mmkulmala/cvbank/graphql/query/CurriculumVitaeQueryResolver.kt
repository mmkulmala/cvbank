package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.CurriculumVitaeDao
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 13/09/2018.
 */
@Component
class CurriculumVitaeQueryResolver(
        private val curriculumVitaeDao: CurriculumVitaeDao
): GraphQLQueryResolver {
    fun curriculumVitae(id: String) = curriculumVitaeDao.getCurriculumVitaeById(id)
}