package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLMutationResolver
 import fi.phz.cvbank.data.ProjectInput
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class ProfileMutationResolver(
        private val profileDao: ProfileDao
) : GraphQLMutationResolver {
    fun createProfile(input: ProjectInput) =
            profileDao.createProfile(input.network, input.username, input.url)

}