package org.mmkulmala.cvbank.repository

import org.mmkulmala.cvbank.data.Employment
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by marno kulmala on 10/10/2018.
 */
interface EmploymentRepository : MongoRepository<Employment, String> {
}