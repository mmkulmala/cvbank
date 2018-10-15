package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLMutationResolver
 import fi.phz.cvbank.data.MetaInput
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class WorkMutationResolver(
        private val workDao: WorkDao
) : GraphQLMutationResolver {
    fun createWork(input: MetaInput) =
            workDao.createWork(input.company, input.position, input.website,
                    input.startDate, input.endDate, input.summary, input.highlights)

}