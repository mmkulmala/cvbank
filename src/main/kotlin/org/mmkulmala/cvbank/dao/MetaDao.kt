package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.MediaRepository
import org.mmkulmala.cvbank.repository.MetaRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class MetaDao(
        private val metaRepository: MetaRepository
) {
    fun getMetaById(id: String) = metaRepository.findById(id)

    fun createMeta(format: String, version: String) =
            metaRepository.save(Meta(format = format, version = version))

}