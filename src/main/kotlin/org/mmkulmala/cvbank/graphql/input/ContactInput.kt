package org.mmkulmala.cvbank.graphql.input

/**
 * Created by marno kulmala on 12/09/2018.
 */
data class ContactInput(
        val website: String,
        val phone: String,
        val email: String,
        val other: List<OtherInput>
)