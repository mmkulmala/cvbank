package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLQueryResolver
 import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class ReferenceQueryResolver(
        private val referenceDao: ReferenceDao
): GraphQLQueryResolver {
    fun reference(id: String) = referenceDao.getReferenceById(id)
}