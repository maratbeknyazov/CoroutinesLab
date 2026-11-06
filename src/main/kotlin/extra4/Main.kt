package extra4

import kotlinx.coroutines.*

data class User(val id: Int)

suspend fun loadUser(id: Int): User {
    delay(100)
    return User(id)
}

fun main() = runBlocking { println(loadUser(1)) }
