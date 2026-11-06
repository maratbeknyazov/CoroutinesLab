package question10

import kotlinx.coroutines.*

fun main() = runBlocking {
    coroutineScope {
        launch { delay(200); println("avatar loaded") }
        launch { delay(100); println("settings loaded") }
    }
    println("Profile ready")
    launch { println("after scope coroutine") }
    println("end of main")
}
