package org.mmkulmala.cvbank.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.dao.ContactDao
import org.mmkulmala.cvbank.dao.CurriculumVitaeDao
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 13/09/2018.
 */
@Component
class ContactQueryResolver(
        private val contactDao: ContactDao
): GraphQLQueryResolver {
    fun contact(id: String) = contactDao.getContactById(id)
}