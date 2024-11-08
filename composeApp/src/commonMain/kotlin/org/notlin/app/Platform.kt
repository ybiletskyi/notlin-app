package org.notlin.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform