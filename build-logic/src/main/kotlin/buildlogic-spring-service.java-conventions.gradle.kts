plugins {
    id("buildlogic-spring-core-funix.java-conventions")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

group = "dev.funixgaming.spring.core.plugins.service"
version = libs.findVersion("project.version").get().toString()

dependencies {
    implementation(libs.findLibrary("org.mapstruct").get())
    testImplementation(libs.findLibrary("org.mapstruct").get())

    annotationProcessor(libs.findLibrary("org.mapstruct.processor").get())
    testAnnotationProcessor(libs.findLibrary("org.mapstruct.processor").get())

    api(libs.findLibrary("com.google.guava").get())
}
