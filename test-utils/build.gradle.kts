plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(libs.org.springframework.boot.spring.boot.starter.data.jpa)
    api(libs.org.springframework.boot.spring.boot.starter.web)
}

group = "dev.funixgaming.spring.core.test"
description = "test-utils"

java {
    withJavadocJar()
}
