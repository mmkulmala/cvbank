package org.mmkulmala.cvbank.services



import org.litote.kmongo.KMongo
import org.litote.kmongo.eq
import org.litote.kmongo.findOne
import org.mmkulmala.cvbank.MongoProperties
import org.mmkulmala.cvbank.data.CurriculumVitae
import org.springframework.stereotype.Component
import java.io.File
import java.io.IOException
import java.io.PrintWriter
import java.util.concurrent.TimeUnit

@Component
class ResumeCreationService(
        private val mongoProperties: MongoProperties
) {

    fun createPDF(resumeName: String): Boolean {

        val client = KMongo.createClient() //get com.mongodb.MongoClient new instance
        val database = client.getDatabase(mongoProperties.mongodbDatabase) //normal java driver usage
        val col = database.getCollection("curriculumVitae", CurriculumVitae::class.java)  //KMongo extension method

        val cv : CurriculumVitae? = col.findOne(CurriculumVitae::name eq resumeName) // search for right resume

        writeToFile(cv.toString(), "output/$resumeName.json") // write it to output folder for hackmyresume

        "hackmyresume BUILD output/$resumeName.json TO output/$resumeName.pdf -t modern".runCommand(File("output"))
        return File("output/$resumeName.pdf").exists()
    }

    private fun writeToFile(content: String, fileName: String) {
        val writer = PrintWriter(fileName)
        writer.append(content)
        writer.close()
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

