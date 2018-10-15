package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.ProjectRepository
import org.mmkulmala.cvbank.repository.ReferenceContactRepository
import org.mmkulmala.cvbank.repository.ReferenceRepository
import org.mmkulmala.cvbank.repository.SampleRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class SampleDao(
        private val sampleRepository: SampleRepository
) {
    fun getSampleById(id: String) = sampleRepository.findById(id)

    fun createSample(title: String,summary: String,url: String,date: String) =
            sampleRepository.save(Sample(title = title,summary = summary,url = url,date = date))

}