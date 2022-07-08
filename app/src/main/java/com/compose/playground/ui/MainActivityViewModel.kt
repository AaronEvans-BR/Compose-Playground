package com.compose.playground.ui

import com.compose.playground.util.BaseViewModel
import com.playground.DummyService
import com.playground.PedometerService

class MainActivityViewModel(
    private val dummyService: DummyService,
    private val pedometerService: PedometerService
) : BaseViewModel() {
    fun getServiceData() = dummyService.getData()
    fun getPedometerServiceInitializedFrom() = pedometerService.initializedFrom
}

