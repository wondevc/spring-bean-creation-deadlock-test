import org.springframework.boot.gradle.tasks.bundling.BootJar

group = "com.example"
version = "0.0.1-SNAPSHOT"

plugins {
    id("org.springframework.boot") version "3.3.7"
    id("io.spring.dependency-management") version "1.1.7"
    kotlin("plugin.spring") version "2.0.20"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
}

tasks {
    withType<BootJar> {
        enabled = true
    }
}
