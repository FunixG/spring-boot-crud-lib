plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":exceptions"))
    api(project(":tools"))
    testImplementation(project(":test-utils"))

    implementation(libs.org.mapstruct)
    annotationProcessor(libs.org.mapstruct.processor)
    testImplementation(libs.org.mapstruct)
    testAnnotationProcessor(libs.org.mapstruct.processor)
    api(libs.com.google.guava)
}

group = "dev.funixgaming.spring.core.crud"
description = "crud"

java {
    withJavadocJar()
}
