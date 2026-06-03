package com.affirm.merchantapi

import com.foam.kotlin.*

object FoamInit {
    fun initialize() {
        Foam.init(
            FoamConfig(
                serviceName = "merchant-integration-api",
                apiKey = System.getenv("FOAM_API_KEY") ?: "",
                isProduction = System.getenv("SPRING_PROFILES_ACTIVE") == "production",
                enableTraces = true,
                enableMetrics = true
            )
        )
    }
}