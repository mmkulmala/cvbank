package org.mmkulmala.cvbank.graphql.input

data class HistoryInput (
        val employer: String,
        val url: String,
        val position: String,
        val summary: String,
        val start: String,
        val end: String,
        val keywords: List<String>,
        val highlights: List<String>
)
