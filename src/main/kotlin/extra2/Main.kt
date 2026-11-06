package extra2

import kotlinx.coroutines.*

fun main() = runBlocking {
    coroutineScope {
        launch {
            launch { delay(200); println("grandchild done") }
            println("child 1 done")
        }
        launch { delay(100); println("child 2 done") }
    }
    println("scope done")
}
