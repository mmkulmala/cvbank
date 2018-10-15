package org.mmkulmala.cvbank.graphql.input

data class InterestInput(
        val name: String,
        val summary: String,
        val keywords: List<String>
)
