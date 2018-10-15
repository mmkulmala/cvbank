package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class WorkQueryResolver(
        private val workDao: WorkDao
): GraphQLQueryResolver {
    fun work(id: String) = workDao.getWorkById(id)
}