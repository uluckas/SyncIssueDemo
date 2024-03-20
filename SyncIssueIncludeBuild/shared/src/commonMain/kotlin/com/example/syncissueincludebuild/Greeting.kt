package com.example.syncissueincludebuild

class Greeting {
    private val platform: Platform = getPlatform()
x
    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}