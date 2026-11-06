package question05

import kotlinx.coroutines.runBlocking

suspend fun currentThreadName(): String = Thread.currentThread().name

fun main() = runBlocking {
    println("before: ${Thread.currentThread().name}")
    println("inside: ${currentThreadName()}")
}
