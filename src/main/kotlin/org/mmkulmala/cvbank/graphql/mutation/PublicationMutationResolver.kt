package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLMutationResolver
 import fi.phz.cvbank.data.SampleInput
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class PublicationMutationResolver(
        private val publicationDao: PublicationDao
) : GraphQLMutationResolver {
    fun createPublication(input: SampleInput) =
            publicationDao.createPublication(input.name, input.publisher, input.releaseDate,
                    input.website, input.summary)

}