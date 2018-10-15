package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLMutationResolver
 import fi.phz.cvbank.data.OtherInput
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class VolunteerMutationResolver(
        private val volunteerDao: VolunteerDao
) : GraphQLMutationResolver {
    fun createVolunteer(input: OtherInput) =
            volunteerDao.createVolunteer(input.organization, input.position, input.website,
                    input.startDate, input.endDate, input.summary, input.highlights)
}