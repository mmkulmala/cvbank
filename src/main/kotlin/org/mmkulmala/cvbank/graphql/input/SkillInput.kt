package org.mmkulmala.cvbank.graphql.input

/**
 * Created by marno kulmala on 12/09/2018.
 */

data class SkillInput(
        val name: String?,
        val summary: String?,
        val level: String?,
        val years: String?,
        val proof: String?
)