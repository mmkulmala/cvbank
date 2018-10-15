package org.mmkulmala.cvbank.dao

import fi.phz.cvbank.repository.MetaRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class PublicationDao(
        private val publicationRepository: MetaRepository
) {
    fun getPublicationById(id: String) = publicationRepository.findById(id)

    fun createPublication(name: String, publisher: String, releaseDate: String,
                      website: String, summary: String) =
            publicationRepository.save(Publication(name = name, publisher = publisher, releaseDate = releaseDate,
                    website = website, summary = summary))

}