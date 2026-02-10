plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
}

dependencies {
    // https://plugins.gradle.org/plugin/io.spring.dependency-management
    implementation("io.spring.gradle:dependency-management-plugin:1.1.7")
    // https://spring.io/projects/spring-boot
    implementation("org.springframework.boot:spring-boot-gradle-plugin:4.0.2")
}
