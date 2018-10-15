package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.MediaRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class MediaDao(
        private val mediaRepository: MediaRepository
) {
    fun getMediaById(id: String) = mediaRepository.findById(id)

    fun createMedia(category: String, url: String) =
            mediaRepository.save(Media(category = category, url = url))

}