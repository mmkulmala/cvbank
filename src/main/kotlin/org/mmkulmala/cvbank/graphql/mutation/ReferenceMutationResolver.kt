package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLMutationResolver
 import fi.phz.cvbank.data.ReferenceInput
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class ReferenceMutationResolver(
        private val referenceDao: ReferenceDao
) : GraphQLMutationResolver {
    fun createReference(input: ReferenceInput) =
            referenceDao.createReference(input.name, input.reference)

}