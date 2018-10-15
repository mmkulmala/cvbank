package org.mmkulmala.cvbank.graphql.input

data class CurriculumVitaeInput(
        val name: String,
        val meta: MetaInput,
        val info: InfoInput,
        val contact: ContactInput,
        val location: LocationInput,
        val projects: List<ProjectInput>,
        val social: List<SocialInput>,
        val employment: EmploymentInput,
        val education: EducationInput,
        val skills: SkillsInput,
        val samples: List<SampleInput>,
        val references: List<ReferenceInput>,
        val languages: List<LanguageInput>,
        val interests: List<InterestInput>
)