package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class PublicationQueryResolver(
        private val publicationDao: PublicationDao
): GraphQLQueryResolver {
    fun publication(id: String) = publicationDao.getPublicationById(id)
}