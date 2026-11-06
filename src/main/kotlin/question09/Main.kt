package question09

import kotlinx.coroutines.*

fun main() = runBlocking {
    val parent = launch {
        for (i in 1..2) launch {
            try {
                delay(1000)
                println("request $i completed")
            } finally {
                println("request $i cleanup")
            }
        }
    }
    delay(100)
    parent.cancelAndJoin()
    println("end")
}
