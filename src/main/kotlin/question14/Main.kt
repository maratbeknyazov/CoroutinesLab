package question14

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job: Job = launch {
        val result = 6 * 7
        println("launch calculated $result")
    }
    job.join()
    println("launch returns Job, no result value")
    val result: Deferred<Int> = async { 6 * 7 }
    println(result.await())
}
