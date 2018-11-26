package org.mmkulmala.cvbank.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.mmkulmala.cvbank.services.EmailService
import org.springframework.stereotype.Component

@Component
class Query(
        private val emailService: EmailService
) : GraphQLQueryResolver {
    fun version() = "1.0.0"

    fun sendAsEmail(senderEmail : String, password : String, toMail : String, resumeName: String)
            = emailService.sendCVAsAttachment(senderEmail, password, toMail, resumeName)
}