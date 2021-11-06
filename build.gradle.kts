import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    application
}

group = "com.linecorp.id"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test:1.5.31"))
}

tasks {
    test {
        useJUnitPlatform()
    }

    withType<Wrapper>() {
        gradleVersion = "7.2"
    }

    withType<KotlinCompile>() {
        kotlinOptions.jvmTarget = "11"
    }
}

application {
    mainClass.set("MainKt")
}