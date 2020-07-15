package com.hidekscorp.pocs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocApplication

fun main(args: Array<String>) {
	runApplication<PocApplication>(*args)
}
