package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.ProjectRepository
import org.mmkulmala.cvbank.repository.ReferenceContactRepository
import org.mmkulmala.cvbank.repository.ReferenceRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class ReferenceContactDao(
        private val referenceContactRepository: ReferenceContactRepository
) {
    fun getReferenceContactById(id: String) = referenceContactRepository.findById(id)

    fun createReferenceContact(label: String, flavor: String, value: String) =
            referenceContactRepository.save(ReferenceContact(label = label, flavor = flavor, value = value))

}