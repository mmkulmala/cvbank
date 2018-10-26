package org.mmkulmala.cvbank.services

import org.springframework.stereotype.Component
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

@Component
class ResumeCreationService {

    fun createPDF(resumeName: String): Boolean {
        "hackmyresume BUILD output/$resumeName.json TO output/$resumeName.pdf -t modern".runCommand(File("output"))
        return File("output/$resumeName.pdf").exists()
    }

    private fun String.runCommand(workingDir: File): String? {
        try {
            val parts = this.split("\\s".toRegex())
            val proc = ProcessBuilder(*parts.toTypedArray())
                    .directory(workingDir)
                    .redirectOutput(ProcessBuilder.Redirect.PIPE)
                    .redirectError(ProcessBuilder.Redirect.PIPE)
                    .start()

            proc.waitFor(60, TimeUnit.SECONDS)
            return proc.inputStream.bufferedReader().readText()
        } catch(e: IOException) {
            e.printStackTrace()
            return null
        }
    }
}

