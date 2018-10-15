package org.mmkulmala.cvbank.dao

import fi.phz.cvbank.data.Reference
import fi.phz.cvbank.repository.ReferenceRepository
import org.springframework.stereotype.Component

/**
 * Created by phz on 24/09/2018.
 */
@Component
class ReferenceDao(
        private val referenceRepository: ReferenceRepository
) {
    fun getReferenceById(id: String) = referenceRepository.findById(id)

    fun createReference(name: String, reference: String) =
            referenceRepository.save(Reference(name = name, reference = reference))

}