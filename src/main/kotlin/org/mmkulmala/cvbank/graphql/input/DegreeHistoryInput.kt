package org.mmkulmala.cvbank.graphql.input

/**
 * Created by marno kulmala on 24/09/2018.
 */
data class DegreeHistoryInput (
        val institution: String,
        val title: String,
        val url: String,
        val start: String,
        val end: String,
        val grade: String,
        val summary: String,
        val curriculum: List<String>
)