plugins {
    id("buildlogic.java-conventions")
}

group = "dev.funixgaming.spring.core.storage"
description = "storage"

dependencies {
    api(project(":crud"))
    api(project(":test-utils"))
    api(libs.org.mapstruct)
    testImplementation(libs.org.mapstruct)
    annotationProcessor(libs.org.mapstruct.processor)
    testAnnotationProcessor(libs.org.mapstruct.processor)

    implementation(libs.org.imgscalr.imgscalr.lib)
}

java {
    withJavadocJar()
}
