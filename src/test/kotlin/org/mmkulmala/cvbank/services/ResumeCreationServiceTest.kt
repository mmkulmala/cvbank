package org.mmkulmala.cvbank.services

import com.nhaarman.mockito_kotlin.mock
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ResumeCreationServiceTest {

    @Test
    fun resume() {
        val mockedResume = mock<ResumeCreationService>()
        mockedResume.createPDF("jane")
    }

}