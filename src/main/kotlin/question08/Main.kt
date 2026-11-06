package question08

import kotlinx.coroutines.*

fun main() = runBlocking {
    val parent = launch {
        launch {
            delay(200)
            println("child done")
        }
        println("parent body done")
    }
    parent.join()
    println("report completed")
}
