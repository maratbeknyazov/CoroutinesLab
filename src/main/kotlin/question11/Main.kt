package question11

import kotlinx.coroutines.*

fun CoroutineScope.startCounter(name: String, limit: Int): Job = launch {
    for (number in 1..limit) {
        delay(100)
        println("$name $number")
    }
}

fun main() = runBlocking {
    coroutineScope {
        startCounter("A", 2)
        startCounter("B", 3)
        println("launched")
    }
}
