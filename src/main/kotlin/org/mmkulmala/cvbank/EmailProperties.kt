package org.mmkulmala.cvbank

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "email")
class EmailProperties {
    lateinit var hostname: String
    lateinit var smtpport: String
    lateinit var subject: String
}