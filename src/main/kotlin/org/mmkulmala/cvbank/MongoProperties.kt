package org.mmkulmala.cvbank

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "spring.data.mongodb")
class MongoProperties {
    lateinit var mongodbDatabase: String
    lateinit var mongodbPort: String
}