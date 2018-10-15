package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.*
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class SocialDao(
        private val socialRepository: SocialRepository
) {
    fun getSocialById(id: String) = socialRepository.findById(id)

    fun createSocial(label: String,network: String,user: String,url: String) =
            socialRepository.save(Social(label = label,network = network,user = user,url = url))

}