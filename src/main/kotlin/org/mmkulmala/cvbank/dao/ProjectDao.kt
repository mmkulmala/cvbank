package org.mmkulmala.cvbank.dao

import org.mmkulmala.cvbank.data.*
import org.mmkulmala.cvbank.repository.ProjectRepository
import org.springframework.stereotype.Component

/**
 * Created by marno kulmala on 24/09/2018.
 */
@Component
class ProjectDao(
        private val projectRepository: ProjectRepository
) {
    fun getProjectById(id: String) = projectRepository.findById(id)

    fun createProject(title: String, category: String, role: String, url: String, start: String,
                     end: String, repo: String, description: String, summary: String, keywords: List<String>, media: List<Media>) =
            projectRepository.save(Project(title = title, category = category, role = role, url = url, start = start,
                    end = end, repo = repo, description = description, summary = summary, keywords = keywords, media = media))

}