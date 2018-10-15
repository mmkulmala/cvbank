package org.mmkulmala.cvbank.graphql.input

import fi.phz.cvbank.data.*

data class CurriculumVitaeInput(
        val name: String,
        val meta: Meta,
        val info: Info,
        val contact: Contact,
        val location: Location,
        val projects: List<ProjectInput>,
        val social: List<SocialInput>,
        val employment: EmploymentInput,
        val education: EducationInput,
        val skills: SkillsInput,
        val samples: List<SampleInput>,
        val references: List<ReferenceInput>,
        val languages: List<LanguageInput>,
        val interests: List<EducationInput>
)