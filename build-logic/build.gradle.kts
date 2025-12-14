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

subprojects {
    apply(plugin = "maven-publish")
    configure<PublishingExtension> {
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

        publications {
            register<MavenPublication>("gpr") {
                from(components["java"])
            }
        }
    }
}