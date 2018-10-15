package org.mmkulmala.cvbank.graphql.input

import fi.phz.cvbank.data.History

data class EmploymentInput(
        val summary: String,
        val history: List<HistoryInput>
)