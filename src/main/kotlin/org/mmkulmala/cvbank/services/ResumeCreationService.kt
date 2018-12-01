package org.mmkulmala.cvbank.services



import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.mmkulmala.cvbank.HmrProperties
import org.mmkulmala.cvbank.dao.CurriculumVitaeDao
import org.springframework.stereotype.Component
import java.io.File
import java.lang.ProcessBuilder.Redirect
import java.util.concurrent.TimeUnit

@Component
class ResumeCreationService(
        private val curriculumVitaeDao: CurriculumVitaeDao,
        private val hmrProperties: HmrProperties
) {

    fun createPDF(resumeName: String): Boolean {

        val cv = curriculumVitaeDao.getCurriculumVitaeByName(resumeName)

        val mapper = jacksonObjectMapper()

        // Object to Json File
        var cvAsJson = mapper.writeValue(File("output/$resumeName.json"), cv)

        val path = hmrProperties.path

        "$path BUILD output/$resumeName.json TO output/$resumeName.pdf -t modern".runCommand()

        return File("output/$resumeName.pdf").exists()
    }

    private fun String.runCommand(workingDir: File? = null) {
        val process = ProcessBuilder(*split(" ").toTypedArray())
                .directory(workingDir)
                .redirectOutput(Redirect.INHERIT)
                .redirectError(Redirect.INHERIT)
                .start()
        if (!process.waitFor(hmrProperties.timeout.toLong(), TimeUnit.SECONDS)) {
            process.destroy()
            throw RuntimeException("execution timed out: $this")
        }
        if (process.exitValue() != 0) {
            throw RuntimeException("execution failed with code ${process.exitValue()}: $this")
        }
    }
}

