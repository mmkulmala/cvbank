package org.mmkulmala.cvbank.repository

import org.mmkulmala.cvbank.data.ReferenceContact
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReferenceContactRepository : MongoRepository<ReferenceContact, String> {
}