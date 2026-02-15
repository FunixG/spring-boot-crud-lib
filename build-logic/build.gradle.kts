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

/*gradlePlugin {
    plugins {
        create("springConventions") {
            id = "dev.funixgaming.spring.conventions"
            implementationClass = "Dev_funixgaming_spring_conventionsPlugin"
        }
        create("springConventionsService") {
            id = "dev.funixgaming.spring.conventions.service"
            implementationClass = "Dev_funixgaming_spring_conventions_servicePlugin"
        }
        create("springConventionsPostgres") {
            id = "dev.funixgaming.spring.conventions.postgres"
            implementationClass = "Dev_funixgaming_spring_conventions_postgresPlugin"
        }
    }
}*/

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
