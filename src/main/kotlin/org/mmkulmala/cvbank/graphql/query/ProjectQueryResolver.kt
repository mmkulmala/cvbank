package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.*
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class ProjectQueryResolver(
        private val projectDao: ProjectDao
): GraphQLQueryResolver {
    fun project(id: String) = projectDao.getProjectById(id)
}