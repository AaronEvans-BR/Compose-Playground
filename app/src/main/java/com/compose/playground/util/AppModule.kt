package com.compose.playground.util

import com.compose.playground.ui.MainActivityViewModel
import org.koin.dsl.module

object AppModule {
    val module = module {
        single { MainActivityViewModel(get(), get()) }
    }
}
