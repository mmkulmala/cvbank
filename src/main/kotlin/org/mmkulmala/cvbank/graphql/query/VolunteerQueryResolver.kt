package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLQueryResolver
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class VolunteerQueryResolver(
        private val volunteerDao: VolunteerDao
): GraphQLQueryResolver {
    fun volunteer(id: String) = volunteerDao.getVolunteerById(id)
}