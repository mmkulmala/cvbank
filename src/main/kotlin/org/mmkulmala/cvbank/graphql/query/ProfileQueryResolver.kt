package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class ProfileQueryResolver(
        private val profileDao: ProfileDao
): GraphQLQueryResolver {
    fun profile(id: String) = profileDao.getProfileById(id)
}