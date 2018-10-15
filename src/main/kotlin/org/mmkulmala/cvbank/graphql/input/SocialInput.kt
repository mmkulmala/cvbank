package org.mmkulmala.cvbank.graphql.input

data class SocialInput (
        val label: String,
        val network: String,
        val user: String,
        val url: String
)