package com.hidekscorp.pocs.controllers

import com.hidekscorp.pocs.services.PocService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PocController(
        val logger: Logger = LoggerFactory.getLogger(PocController::class.java),
        val pocService: PocService
) {

    @GetMapping("/")
    fun rollbackTransactionWithEvent() {
        try {
            pocService.execute()
        } catch (exception: Exception) {
            logger.error("Exception was raised by PocService")
        }
    }

}