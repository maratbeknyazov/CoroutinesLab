package extra1

import kotlinx.coroutines.*
import kotlin.math.roundToLong
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val delayTime = measureTimeMillis {
        coroutineScope { repeat(3) { launch { delay(300) } } }
    }
    val sleepTime = measureTimeMillis {
        coroutineScope { repeat(3) { launch { Thread.sleep(300) } } }
    }
    println("delay: ${(delayTime / 100.0).roundToLong() * 100} ms")
    println("sleep: ${(sleepTime / 100.0).roundToLong() * 100} ms")
}
