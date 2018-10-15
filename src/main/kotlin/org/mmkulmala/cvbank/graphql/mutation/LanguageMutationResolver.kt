package fi.phz.cvbank.dao

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import fi.phz.cvbank.data.*
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class LanguageMutationResolver(
        private val languageDao: LanguageDao
) : GraphQLMutationResolver {
    fun createLanguage(input: LanguageInput) =
            languageDao.createLanguage(input.name, input.level)

}