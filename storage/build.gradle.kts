plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":crud"))
    api(project(":test-utils"))
    implementation(libs.org.mapstruct)
    annotationProcessor(libs.org.mapstruct.processor)
    testImplementation(libs.org.mapstruct)
    testAnnotationProcessor(libs.org.mapstruct.processor)
    implementation(libs.org.imgscalr.imgscalr.lib)
}

group = "dev.funixgaming.spring.core.storage"
description = "storage"

java {
    withJavadocJar()
}
