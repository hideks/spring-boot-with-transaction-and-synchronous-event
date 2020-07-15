package com.hidekscorp.pocs.listeners

import com.hidekscorp.pocs.events.PocCreatedEvent
import com.hidekscorp.pocs.services.ThirdPartyGateway
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.context.event.EventListener

@Component
class EventListener(
        val logger: org.slf4j.Logger = LoggerFactory.getLogger(EventListener::class.java),
        val thirdPartyGateway: ThirdPartyGateway
) {

    @EventListener
    fun handleEvent(pocCreatedEvent: PocCreatedEvent) {
        logger.info("EventHandler picked up ${pocCreatedEvent.message}")

        thirdPartyGateway.execute()
    }
}