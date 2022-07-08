package com.playground

interface DummyService {
    fun getData(): String
}

internal class DummyServiceImpl : DummyService {
    override fun getData(): String {
        return "Your dummy service is live!"
    }
}