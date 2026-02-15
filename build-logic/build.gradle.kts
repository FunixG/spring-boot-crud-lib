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
