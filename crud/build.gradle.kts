plugins {
    id("buildlogic.java-conventions")
}

group = "dev.funixgaming.spring.core.crud"
description = "crud"

dependencies {
    api(project(":exceptions"))
    api(project(":tools"))
    testImplementation(project(":test-utils"))

    api(libs.org.mapstruct)
    testImplementation(libs.org.mapstruct)

    annotationProcessor(libs.org.mapstruct.processor)
    testAnnotationProcessor(libs.org.mapstruct.processor)

    api(libs.com.google.guava)
}

java {
    withJavadocJar()
}
