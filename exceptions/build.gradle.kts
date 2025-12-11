plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(libs.org.springframework.boot.spring.boot.starter.web)
    api(libs.io.sentry.sentry.spring.boot.starter.jakarta)
}

group = "dev.funixgaming.spring.core.exceptions"
description = "exceptions"

java {
    withJavadocJar()
}
