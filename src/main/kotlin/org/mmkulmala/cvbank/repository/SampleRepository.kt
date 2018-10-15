package org.mmkulmala.cvbank.repository

import org.mmkulmala.cvbank.data.Sample
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SampleRepository : MongoRepository<Sample, String> {
}