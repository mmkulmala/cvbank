package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class LocationQueryResolver(
        private val locationDao: LocationDao
): GraphQLQueryResolver {
    fun location(id: String) = locationDao.getLocationById(id)
}