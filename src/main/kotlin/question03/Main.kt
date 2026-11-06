package question03

import kotlinx.coroutines.delay

suspend fun loadUser() {
    delay(100)
    println("load user")
    checkPassword()
}

suspend fun checkPassword() {
    delay(100)
    println("check password")
    openProfile()
}

suspend fun openProfile() {
    delay(100)
    println("open profile")
}

suspend fun main() { loadUser() }
