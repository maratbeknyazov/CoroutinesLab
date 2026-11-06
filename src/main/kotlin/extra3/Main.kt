package extra3

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch { println("Hello from coroutine") }
    }
}
