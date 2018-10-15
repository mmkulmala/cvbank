package org.mmkulmala.cvbank.repository

import org.mmkulmala.cvbank.data.Sample
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by marno kulmala on 10/10/2018.
 */
@Repository
interface SampleRepository : MongoRepository<Sample, String> {
}