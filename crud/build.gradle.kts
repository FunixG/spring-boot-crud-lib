plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":exceptions"))
    api(project(":tools"))
    api(libs.org.springframework.boot.spring.boot.starter.data.jpa)
    api(libs.org.springframework.boot.spring.boot.starter.validation)
    api(libs.org.springframework.cloud.spring.cloud.starter.openfeign)
    api(libs.org.springframework.boot.spring.boot.starter.web)
    api(libs.org.mapstruct.mapstruct)
    api(libs.io.github.openfeign.feign.okhttp)
    testImplementation(project(":test-utils"))
}

group = "dev.funixgaming.spring.core.crud"
description = "crud"

java {
    withJavadocJar()
}
