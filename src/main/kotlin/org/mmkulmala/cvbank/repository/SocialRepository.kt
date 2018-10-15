package org.mmkulmala.cvbank.repository

import org.mmkulmala.cvbank.data.Social
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by marno kulmala on 19/09/2018.
 */
@Repository
interface SocialRepository : MongoRepository<Social, String> {
}