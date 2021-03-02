import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

plugins {
  kotlin("jvm") version "1.4.31"
}

repositories {
  jcenter()
}

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1")
}

tasks.withType<KotlinCompile<KotlinJvmOptions>> {
  kotlinOptions {
    useIR = true
  }
}