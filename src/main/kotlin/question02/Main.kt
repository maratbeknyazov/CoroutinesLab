package question02

import kotlinx.coroutines.*

fun main() = runBlocking {
    val drinks = listOf("espresso" to 300L, "tea" to 100L, "latte" to 200L)
    println("delay:")
    coroutineScope {
        for ((name, time) in drinks) launch {
            println("$name start")
            delay(time)
            println("$name end")
        }
    }
    println("sleep:")
    coroutineScope {
        for ((name, time) in drinks) launch {
            println("$name start")
            Thread.sleep(time)
            println("$name end")
        }
    }
}
