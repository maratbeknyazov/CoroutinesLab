package question13

import kotlinx.coroutines.*

fun main() {
    val result = runBlocking {
        val job: Job = launch { println("launch body") }
        println("launch returns Job")
        job.join()
        val deferred: Deferred<Int> = async { 42 }
        println("async returns Deferred: ${deferred.await()}")
        val scopeResult = coroutineScope { "scope value" }
        println("coroutineScope returns: $scopeResult")
        "blocking value"
    }
    println("runBlocking returns: $result")
}
