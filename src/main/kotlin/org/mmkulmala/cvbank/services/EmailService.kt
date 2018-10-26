package org.mmkulmala.cvbank.services

import org.apache.commons.mail.DefaultAuthenticator
import org.apache.commons.mail.MultiPartEmail
import org.mmkulmala.cvbank.EmailProperties
import org.springframework.stereotype.Component
import java.io.File

@Component
class EmailService(
        private val emailProperties: EmailProperties,
        private val resumeCreationService: ResumeCreationService
) {

    fun sendCVAsAttachment(senderEmail : String, password : String, toMail : String, resumeName: String) {
        val email = MultiPartEmail()
        email.hostName = emailProperties.emailHostname
        email.setSmtpPort(emailProperties.emailSmtpport.toInt())
        email.setAuthenticator(DefaultAuthenticator(senderEmail, password))
        email.isSSLOnConnect = true
        email.setFrom(senderEmail)
        email.addTo(toMail)
        resumeCreationService.createPDF(resumeName)
        email.attach(File("output/$resumeName.pdf"))
        email.subject = emailProperties.emailSubject + "$resumeName"
        email.send()
    }
}