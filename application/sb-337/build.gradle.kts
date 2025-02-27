import org.gradle.kotlin.dsl.withType
import org.springframework.boot.gradle.tasks.bundling.BootJar

group = "com.example"
version = "0.0.1-SNAPSHOT"

plugins {
    id("org.springframework.boot") version "3.3.7"
    id("io.spring.dependency-management") version "1.1.7"
    kotlin("plugin.spring") version "2.0.20"
}

dependencies {
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-core")

    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")

    runtimeOnly("org.flywaydb:flyway-mysql:11.3.3")

    runtimeOnly("io.asyncer:r2dbc-mysql:1.4.0")
    runtimeOnly("mysql:mysql-connector-java:8.0.32")
}

tasks {
    withType<BootJar> {
        enabled = true
    }
}
