package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class LanguageQueryResolver(
        private val languageDao: LanguageDao
): GraphQLQueryResolver {
    fun language(id: String) = languageDao.getLanguageById(id)
}