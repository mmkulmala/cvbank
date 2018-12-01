package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.graphql.input.CurriculumVitaeInput
import org.mmkulmala.cvbank.repository.CurriculumVitaeRepository
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class CurriculumVitaeDao(
        private val curriculumVitaeRepository: CurriculumVitaeRepository
) {
    // using finnish time format
    private fun String.toDate(): Date {
        return SimpleDateFormat("dd.MM.yyyy").parse(this)
    }

    fun getCurriculumVitaeById(id: String) = curriculumVitaeRepository.findById(id)

    fun getCurriculumVitaeByName(name: String) = curriculumVitaeRepository.findByName(name)

    fun getCurriculumVitaeBySkills(skills: Skills) = curriculumVitaeRepository.findBySkills(skills)

    fun getFreePersonsBySkillAndTime(skills: Skills, free: String): List<CurriculumVitae> {
        val cvs = getCurriculumVitaeBySkills(skills)
        val cvsWithFree = ArrayList<CurriculumVitae>()

        /**
         * @TODO: create more kotlin way to do this!
         */
        for (cv in cvs) {
            for (proj in cv.projects) {
                if (proj.end.toDate() <= free.toDate() || proj.end.isNullOrEmpty()) {
                    cvsWithFree.add(cv)
                }
            }
        }
        return cvsWithFree
    }

    fun createCurriculumVitae(name: String, meta: Meta, info: Info, contact: Contact, location: Location, projects: List<Project>,
                              social: List<Social>, employment: Employment, education: Education, skills: Skills, samples: List<Sample>,
                              references: List<Reference>, languages: List<Language>, interests: List<Interest>) =
            curriculumVitaeRepository.save(CurriculumVitae(name = name, meta = meta, info = info, contact = contact, location = location, projects = projects,
                    social = social, employment = employment, education = education, skills = skills, samples = samples,
                    references = references, languages = languages, interests = interests))

    fun deleteCurriculumVitaeById(id: String): String {
        curriculumVitaeRepository.deleteById(id)
        return id
    }

    fun getAllCurriculumVitaes() = curriculumVitaeRepository.findAll()

    fun updateCurriculumVitae(id: String, updatedCV: CurriculumVitaeInput) = curriculumVitaeRepository.save(
            CurriculumVitae(id = id, name = updatedCV.name,
                    meta = Meta(format = updatedCV.meta.format, version = updatedCV.meta.version),
                    info = Info(label = updatedCV.info.label, characterClass = updatedCV.info.characterClass, brief = updatedCV.info.brief,
                            image = updatedCV.info.image, quote = updatedCV.info.quote),
                    contact = Contact(website = updatedCV.contact.website, phone = updatedCV.contact.phone, email = updatedCV.contact.email,
                            other = updatedCV.contact.other.map { Other(label = it.label, flavor = it.label, value = it.value) }),
                    location = Location(address = updatedCV.location.address, city = updatedCV.location.city, region = updatedCV.location.region,
                            code = updatedCV.location.code, countryCode = updatedCV.location.countryCode),
                    projects = updatedCV.projects.map {
                        Project(title = it.title, category = it.category, role = it.role, url = it.url, start = it.start, end = it.end,
                                repo = it.repo, description = it.description, summary = it.summary, keywords = it.keywords, media = it.media.map { Media(category = it.category, url = it.url) })
                    },
                    social = updatedCV.social.map { Social(label = it.label, network = it.network, user = it.user, url = it.url) },
                    employment = Employment(summary = updatedCV.employment.summary, history = updatedCV.employment.history.map {
                        History(employer = it.employer, url = it.url,
                                position = it.position, summary = it.summary, start = it.start, end = it.end, keywords = it.keywords, highlights = it.highlights)
                    }),
                    education = Education(summary = updatedCV.education.summary, level = updatedCV.education.level, degree = updatedCV.education.degree,
                            history = updatedCV.education.history.map {
                                DegreeHistory(institution = it.institution, title = it.title, url = it.url, start = it.start,
                                        end = it.end, grade = it.grade, summary = it.summary, curriculum = it.curriculum)
                            }),
                    skills = Skills(sets = updatedCV.skills.sets.map { org.mmkulmala.cvbank.data.Set(name = it.name, level = it.level, skills = it.skills) },
                            list = updatedCV.skills.list.map { Skill(name = it.name, summary = it.summary, level = it.level, years = it.years, proof = it.proof) }),
                    samples = updatedCV.samples.map { Sample(title = it.title, summary = it.summary, url = it.url, date = it.date) },
                    references = updatedCV.references.map { Reference(name = it.name, flavor = it.flavor, private = it.private, contact = it.contact.map { ReferenceContact(label = it.label, flavor = it.flavor, value = it.value) }) },
                    languages = updatedCV.languages.map { Language(language = it.language, level = it.level) },
                    interests = updatedCV.interests.map { Interest(name = it.name, summary = it.summary, keywords = it.keywords) }))

}