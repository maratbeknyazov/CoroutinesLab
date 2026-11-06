plugins {
    kotlin("jvm") version "2.2.0"
}

repositories { mavenCentral() }

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
}

kotlin { jvmToolchain(17) }

fun registerExample(taskName: String, packageName: String) {
    tasks.register<JavaExec>(taskName) {
        group = "application"
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("$packageName.MainKt")
    }
}

(1..15).forEach {
    val number = it.toString().padStart(2, '0')
    registerExample("run$number", "question$number")
}
(1..5).forEach { registerExample("runExtra$it", "extra$it") }
