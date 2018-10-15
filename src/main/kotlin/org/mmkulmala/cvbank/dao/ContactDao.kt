package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.Contact
import org.mmkulmala.cvbank.data.Other
import org.mmkulmala.cvbank.repository.ContactRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class ContactDao(
        private val contactRepository: ContactRepository
) {
    fun getContactById(id: String) = contactRepository.findById(id)

    fun createContact(website: String, phone: String, email: String, other: List<Other>) =
            contactRepository.save(Contact(website = website, phone = phone, email = email, other = other))
}