package com.example.syncissueincludebuild

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform