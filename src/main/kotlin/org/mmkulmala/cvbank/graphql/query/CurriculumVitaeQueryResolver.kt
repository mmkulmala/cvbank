package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import fi.phz.cvbank.dao.CurriculumVitaeDao
import org.springframework.stereotype.Component

/**
 * Created by phz on 13/09/2018.
 */
@Component
class CurriculumVitaeQueryResolver(
        private val curriculumVitaeDao: CurriculumVitaeDao
): GraphQLQueryResolver {
    fun curriculumVitae(id: String) = curriculumVitaeDao.getCurriculumVitaeById(id)
}