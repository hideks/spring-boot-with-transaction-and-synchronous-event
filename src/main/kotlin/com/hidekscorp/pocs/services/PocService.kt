package com.hidekscorp.pocs.services

import com.hidekscorp.pocs.entities.Poc
import com.hidekscorp.pocs.publishers.EventPublisher
import com.hidekscorp.pocs.repositories.PocRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class PocService(
        val logger: Logger = LoggerFactory.getLogger(PocService::class.java),
        val pocRepository: PocRepository,
        val eventPublisher: EventPublisher
) {

    @Transactional
    fun execute() {
        logger.info("PocService called")

        val poc = Poc(1, "rollback test")

        pocRepository.save(poc)

        eventPublisher.publishEvent("some message")
    }

}