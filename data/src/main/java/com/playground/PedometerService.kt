package com.playground

import android.content.Context

interface PedometerService {
    val initializedFrom: String

    fun addSteps(steps: Int)
}

internal class PedometerServiceImpl(
    private val initLocation: String,
    private val context: Context
) : PedometerService {

    override val initializedFrom: String
        get() = "Pedometer service has been initialized from the $initLocation"

    override fun addSteps(steps: Int) {
    }
}
