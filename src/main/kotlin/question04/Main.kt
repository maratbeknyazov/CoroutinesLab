package question04

import kotlinx.coroutines.*

suspend fun loadUser(): String {
    delay(100)
    return "User loaded"
}

// Fix 1: propagate suspend to the caller.
suspend fun loadFromSuspend() { println(loadUser()) }

// Fix 2: bridge normal blocking code to a coroutine.
fun loadFromNormal() = runBlocking { println(loadUser()) }

suspend fun main() {
    loadFromSuspend()
    loadFromNormal()
}
