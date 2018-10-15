package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.ProjectRepository
import org.mmkulmala.cvbank.repository.ReferenceRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class ReferenceDao(
        private val referenceRepository: ReferenceRepository
) {
    fun getReferenceById(id: String) = referenceRepository.findById(id)

    fun createReference(name: String, flavor: String, private: Boolean, contact: List<ReferenceContact>) =
            referenceRepository.save(Reference(name = name, flavor = flavor, private = private, contact = contact))

}