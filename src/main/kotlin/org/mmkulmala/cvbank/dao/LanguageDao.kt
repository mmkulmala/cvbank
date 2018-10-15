package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.LanguageRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class LanguageDao(
        private val languageRepository: LanguageRepository
) {
    fun getLanguageById(id: String) = languageRepository.findById(id)

    fun createLanguage(language: String, level: String) =
            languageRepository.save(Language(language = language, level = level))

}