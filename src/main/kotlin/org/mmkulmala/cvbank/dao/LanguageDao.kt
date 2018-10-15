package org.mmkulmala.cvbank.dao

import fi.phz.cvbank.data.*
import fi.phz.cvbank.repository.LanguageRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class LanguageDao(
        private val languageRepository: LanguageRepository
) {
    fun getLanguageById(id: String) = languageRepository.findById(id)

    fun createLanguage(name: String, level: String) =
            languageRepository.save(Language(name = name, level = level))

}