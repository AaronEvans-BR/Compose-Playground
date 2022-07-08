package com.compose.playground

import android.app.Application
import com.compose.playground.util.AppModule
import com.playground.util.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class PlaygroundApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@PlaygroundApplication)
            modules(modules = listOf(AppModule.module, DataModule.module))
        }
    }
}