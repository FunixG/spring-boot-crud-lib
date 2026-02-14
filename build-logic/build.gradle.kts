import org.gradle.kotlin.dsl.libs

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation(libs.findLibrary("io.spring.dependency.management.plugin").get())
    implementation(libs.findLibrary("org.spring.boot.gradle.plugin").get())
    implementation(libs.findLibrary("org.flywaydb.flyway.gradle.plugin").get())
}