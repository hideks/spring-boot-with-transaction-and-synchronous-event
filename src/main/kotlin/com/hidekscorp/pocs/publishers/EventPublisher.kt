package com.hidekscorp.pocs.publishers

import com.hidekscorp.pocs.events.PocCreatedEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class EventPublisher(
        var applicationEventPublisher: ApplicationEventPublisher
) {

    fun publishEvent(message: String) {
        applicationEventPublisher.publishEvent(
                PocCreatedEvent(this, message)
        )
    }

}