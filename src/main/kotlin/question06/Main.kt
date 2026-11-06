package question06

import kotlinx.coroutines.*

fun main() = runBlocking {
    for (i in 1..10) launch {
        println("download $i started on ${Thread.currentThread().name}")
        delay(100)
        println("download $i finished")
    }
}
