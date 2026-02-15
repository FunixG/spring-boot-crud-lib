plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "dev.funixgaming.spring"

repositories {
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
}

object Versions {
    // https://plugins.gradle.org/plugin/io.spring.dependency-management
    const val springDependencyManagementPluginVersion = "1.1.0"
    // https://spring.io/projects/spring-boot
    const val springBootVersion = "4.0.2"
    // https://plugins.gradle.org/plugin/org.flywaydb.flyway
    const val flywayPluginVersion = "12.0.1"
}

dependencies {
    implementation("io.spring.gradle:dependency-management-plugin:${Versions.springDependencyManagementPluginVersion}")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:${Versions.springBootVersion}")
    implementation("org.flywaydb:flyway-gradle-plugin:${Versions.flywayPluginVersion}")
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/FunixG/spring-boot-crud-lib")
            credentials {
                username = "FunixG"
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
