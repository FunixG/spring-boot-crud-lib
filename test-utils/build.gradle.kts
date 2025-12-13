plugins {
    id("buildlogic.java-conventions")
}

group = "dev.funixgaming.spring.core.test"
description = "test-utils"

dependencies {
    implementation(libs.com.google.code.gson)
}

java {
    withJavadocJar()
}
