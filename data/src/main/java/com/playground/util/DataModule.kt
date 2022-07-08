package com.playground.util

import com.playground.DummyService
import com.playground.DummyServiceImpl
import com.playground.PedometerService
import com.playground.PedometerServiceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

object DataModule {
    val module = module {
        single<DummyService> { DummyServiceImpl() }
        single<PedometerService>{PedometerServiceImpl("DataModule", androidContext())}
    }
}