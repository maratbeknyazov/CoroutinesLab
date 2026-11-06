package extra5

import kotlinx.coroutines.*

suspend fun greetEverybody(names: List<String>) = coroutineScope {
    for ((index, name) in names.withIndex()) launch {
        delay((index + 1) * 100L)
        println("Hello, $name")
    }
}

fun main() = runBlocking {
    println("before")
    greetEverybody(listOf("Ada", "Linus", "Grace"))
    println("after")
}
