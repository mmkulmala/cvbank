package org.mmkulmala.cvbank.graphql.input

data class InfoInput (
        val label: String,
        val characterClass: String,
        val brief: String,
        val image: String,
        val quote: String
)