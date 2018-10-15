package org.mmkulmala.cvbank.repository

import org.mmkulmala.cvbank.data.Set
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by phz on 19/09/2018.
 */
@Repository
interface SetRepository : MongoRepository<Set, String> {
}