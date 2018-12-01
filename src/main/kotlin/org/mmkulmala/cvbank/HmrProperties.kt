package org.mmkulmala.cvbank

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "hackmyresume")
class HmrProperties {
    lateinit var path: String
    lateinit var timeout: String
}