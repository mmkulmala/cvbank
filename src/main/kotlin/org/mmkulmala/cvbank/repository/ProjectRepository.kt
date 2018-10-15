package org.mmkulmala.cvbank.repository

import org.mmkulmala.cvbank.data.Other
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectRepository : MongoRepository<Other, String> {
}