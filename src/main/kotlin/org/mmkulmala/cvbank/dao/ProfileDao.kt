package org.mmkulmala.cvbank.dao

import fi.phz.cvbank.data.Sample
import fi.phz.cvbank.repository.MediaRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class ProfileDao(
        private val profileRepository: MediaRepository
) {
    fun getProfileById(id: String) = profileRepository.findById(id)

    fun createProfile(network: String, username: String, url: String) =
            profileRepository.save(Sample(network = network, username = username, url = url))

}