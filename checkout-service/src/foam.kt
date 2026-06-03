package com.affirm.checkout

import com.foam.kotlin.Foam
import com.foam.kotlin.FoamConfig

fun initializeFoam() {
    Foam.init(
        FoamConfig(
            serviceName = "checkout-service",
            apiKey = System.getenv("FOAM_API_KEY"),
            isProduction = System.getenv("ENVIRONMENT") == "production",
            enableTraces = true
        )
    )
}