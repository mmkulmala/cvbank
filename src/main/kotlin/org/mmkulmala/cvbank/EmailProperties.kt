package org.mmkulmala.cvbank

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "email")
class EmailProperties {
    lateinit var emailHostname: String
    lateinit var emailSmtpport: String
    lateinit var emailSubject: String
}