package com.hidekscorp.pocs.events

import org.springframework.context.ApplicationEvent

class PocCreatedEvent(source: Any, val message: String): ApplicationEvent(source)