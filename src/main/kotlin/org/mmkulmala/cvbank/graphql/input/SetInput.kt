package org.mmkulmala.cvbank.graphql.input

data class SetInput (
        val name: String,
        val level: String,
        val skills: List<String>
)