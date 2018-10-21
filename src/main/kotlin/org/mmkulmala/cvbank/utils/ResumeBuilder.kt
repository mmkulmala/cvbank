package org.mmkulmala.cvbank.utils

import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

class ResumeBuilder {

    fun createPDF(resumeName: String) {
        "hackmyresume BUILD $resumeName.json TO output/$resumeName.pdf -t modern ".runCommand(File("output"))
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