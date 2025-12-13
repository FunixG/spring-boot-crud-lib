plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("io.spring.gradle:dependency-management-plugin:1.1.7")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:4.0.0")
}