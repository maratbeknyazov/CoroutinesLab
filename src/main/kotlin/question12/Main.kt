package question12

import kotlinx.coroutines.*

fun CoroutineScope.startGreeting(name: String): Job = launch {
    delay(100)
    println("Hello, $name")
}

suspend fun greetPeople(names: List<String>) = coroutineScope {
    for (name in names) launch {
        delay(200)
        println("Hello, $name")
    }
}

fun main() = runBlocking {
    startGreeting("Ada")
    println("after startGreeting")
    greetPeople(listOf("Linus", "Grace"))
    println("after greetPeople")
}
