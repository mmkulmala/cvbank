package org.mmkulmala.cvbank.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import fi.phz.cvbank.dao.CurriculumVitaeDao
import fi.phz.cvbank.data.*
import fi.phz.cvbank.graphql.input.CurriculumVitaeInput
import org.springframework.stereotype.Component

@Component
class CurriculumVitaeMutationResolver(
        private val curriculumVitaeDao: CurriculumVitaeDao
) : GraphQLMutationResolver {
    fun createCurriculumVitae(input: CurriculumVitaeInput) =
            curriculumVitaeDao.createCurriculumVitae(
                    Basics(name = input.basics.name, label = input.basics.label, picture = input.basics.picture,
                            email = input.basics.email, phone = input.basics.phone, website = input.basics.website, summary = input.basics.summary,
                            location = Location(address = input.basics.location.address, postalCode = input.basics.location.postalCode,
                                    city = input.basics.location.city, countryCode = input.basics.location.countryCode,
                                    region = input.basics.location.region),
                            profiles = input.basics.profiles.map { Sample(network = it.network, username = it.username, url = it.url) }),
                    input.work.map { Work(company = it.company, position = it.position, website = it.website,
                            startDate = it.startDate, endDate = it.endDate, summary = it.summary, highlights = it.highlights) },
                    input.volunteer.map { Volunteer(organization = it.organization, position = it.position, website = it.website,
                            startDate = it.startDate, endDate = it.endDate, summary = it.summary, highlights = it.highlights) },
                    input.education.map { Education(institution = it.institution, area = it.area, studyType = it.studyType,
                            startDate = it.startDate, endDate = it.endDate, gpa = it.gpa, courses = it.courses) },
                    input.awards.map { Award(title = it.title, date = it.date, awarder = it.awarder, summary = it.summary) },
                    input.skills.map { Skills(name = it.name, level = it.level, keywords = it.keywords) },
                    input.publications.map { Publication(name = it.name, publisher = it.publisher, releaseDate = it.releaseDate,
                            website = it.website, summary = it.summary) },
                    input.languages.map { Language(name = it.name, level = it.level) },
                    input.interests.map { Interest(name = it.name, keywords = it.keywords) },
                    input.references.map { Reference(name = it.name, reference = it.reference) })
}