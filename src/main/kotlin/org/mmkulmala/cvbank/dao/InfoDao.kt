package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.History
import org.mmkulmala.cvbank.data.Info
import org.mmkulmala.cvbank.repository.HistoryRepository
import org.mmkulmala.cvbank.repository.InfoRepository
import org.springframework.stereotype.Component

@Component
class InfoDao(
        private val infoRepository: InfoRepository
) {
    fun getInfoById(id: String) = infoRepository.findById(id)

    fun createInfo(label: String, characterClass: String, brief: String,
                      image: String, quote: String) =
            infoRepository.save(Info(label = label, characterClass = characterClass, brief = brief,
                    image = image, quote = quote))
}