package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.*
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class SetDao(
        private val setRepository: SetRepository
) {
    fun getSetById(id: String) = setRepository.findById(id)

    fun createSet(name: String,level: String,skills: List<String>) =
            setRepository.save(Set(name = name,level = level,skills = skills))

}