package org.mmkulmala.cvbank.graphql.input

data class EmploymentInput(
        val summary: String,
        val history: List<HistoryInput>
)