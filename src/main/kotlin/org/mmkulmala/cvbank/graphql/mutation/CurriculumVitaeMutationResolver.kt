package org.mmkulmala.cvbank.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.mmkulmala.cvbank.dao.CurriculumVitaeDao
import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.graphql.input.CurriculumVitaeInput
import org.springframework.stereotype.Component

@Component
class CurriculumVitaeMutationResolver(
        private val curriculumVitaeDao: CurriculumVitaeDao
) : GraphQLMutationResolver {
    fun createCurriculumVitae(input: CurriculumVitaeInput) =
            curriculumVitaeDao.createCurriculumVitae(
                    input.name,
                    Meta(format = input.meta.format, version = input.meta.version),
                    Info(label = input.info.label, characterClass = input.info.characterClass, brief = input.info.brief,
                                        image = input.info.image, quote = input.info.quote),
                    Contact(website = input.contact.website, phone = input.contact.phone, email = input.contact.email,
                            other = input.contact.other.map { Other(label = it.label, flavor = it.label, value = it.value) }),
                    Location(address = input.location.address, city = input.location.city, region = input.location.region,
                                        code = input.location.code, countryCode = input.location.countryCode),
                    input.projects.map { Project(title = it.title, category = it.category, role = it.role, url = it.url, start = it.start, end = it.end,
                            repo = it.repo, description = it.description, summary = it.summary, keywords = it.keywords, media = it.media.map { Media(category = it.category, url = it.url) }) },
                    input.social.map { Social(label = it.label,network = it.network,user = it.user,url = it.url) },
                    Employment(summary = input.employment.summary, history = input.employment.history.map { History(employer = it.employer, url = it.url,
                            position = it.position, summary = it.summary, start = it.start, end = it.end, keywords = it.keywords, highlights = it.highlights)}),
                    Education(summary = input.education.summary, level = input.education.level, degree = input.education.degree,
                            history = input.education.history.map { DegreeHistory(institution = it.institution, title = it.title, url = it.url, start = it.start,
                                    end = it.end, grade = it.grade, summary = it.summary, curriculum = it.curriculum) }),
                    Skills(sets = input.skills.sets.map { Set(name = it.name, level = it.level, skills = it.skills) },
                            list = input.skills.list.map { Skill(name = it.name, summary = it.summary, level = it.level, years = it.years, proof = it.proof) }),
                    input.samples.map { Sample(title = it.title,summary = it.summary,url = it.url,date = it.date) },
                    input.references.map { Reference(name = it.name, flavor = it.flavor, private = it.private, contact = it.contact.map { ReferenceContact(label = it.label, flavor = it.flavor, value = it.value) }) },
                    input.languages.map { Language(language = it.language, level = it.level) },
                    input.interests.map { Interest(name = it.name, summary = it.summary, keywords = it.keywords) }
            )

    fun deleteCurriculumVitae(id: String) = curriculumVitaeDao.deleteCurriculumVitaeById(id)

    fun updateCurriculumVitae(id: String, input: CurriculumVitaeInput) = curriculumVitaeDao.updateCurriculumVitae(id, input)
}