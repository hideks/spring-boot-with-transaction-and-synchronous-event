package com.hidekscorp.pocs.services

import org.springframework.stereotype.Component

@Component
class ThirdPartyGateway {

    fun execute() {
        forceException()
    }

    private fun forceException() {
        throw Exception("Forced exception")
    }

}