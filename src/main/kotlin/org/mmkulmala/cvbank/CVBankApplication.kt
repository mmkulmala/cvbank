package org.mmkulmala.cvbank

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class CVBankApplication

fun main(args: Array<String>) {
    SpringApplication.run(CVBankApplication::class.java, *args)
}

