package org.mmkulmala.cvbank.services

import com.nhaarman.mockito_kotlin.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mmkulmala.cvbank.EmailProperties
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class EmailServiceTest {

    @Test
    fun sendEmail() {
        val classUnderTest = mock<EmailService>()
        classUnderTest.sendCVAsAttachment(any(), any(), any(), any())
    }
}