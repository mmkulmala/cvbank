package fi.phz.cvbank.dao

 import com.coxautodev.graphql.tools.GraphQLQueryResolver
 import org.mmkulmala.cvbank.dao.ReferenceContactDao
 import org.mmkulmala.cvbank.dao.ReferenceDao
 import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class ReferenceContactQueryResolver(
        private val referenceContactDao: ReferenceContactDao
): GraphQLQueryResolver {
    fun referenceContact(id: String) = referenceContactDao.getReferenceContactById(id)
}