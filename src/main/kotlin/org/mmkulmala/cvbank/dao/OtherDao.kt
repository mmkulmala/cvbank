package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.OtherRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class OtherDao(
        private val otherRepository: OtherRepository
) {
    fun getOtherById(id: String) = otherRepository.findById(id)

    fun createOther(label: String, flavor: String, value: String) =
            otherRepository.save(Other(label = label, flavor = flavor, value = value))

}