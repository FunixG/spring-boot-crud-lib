plugins {
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

group = "dev.funixgaming.spring.core.plugins"
version = libs.findVersion("project.version").get().toString()

dependencies {
    implementation(libs.findLibrary("io.spring.dependency.management.plugin").get())
    implementation(libs.findLibrary("org.spring.boot.gradle.plugin").get())
    implementation(libs.findLibrary("org.flywaydb.flyway.gradle.plugin").get())
}

gradlePlugin {
    plugins {
        create("buildlogic-spring-core-funix.java-conventions") {
            id = "buildlogic-spring-core-funix.java-conventions"
            implementationClass = "dev.funixgaming.spring.core.plugins.common.JavaConventionsPlugin"
        }
        create("buildlogic-spring-service.java-conventions") {
            id = "buildlogic-spring-service.java-conventions"
            implementationClass = "dev.funixgaming.spring.core.plugins.service.JavaConventionsPlugin"
        }
        create("buildlogic-spring-postgres-service.java-conventions") {
            id = "buildlogic-spring-postgres-service.java-conventions"
            implementationClass = "dev.funixgaming.spring.core.plugins.postgres.JavaConventionsPlugin"
        }
    }
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