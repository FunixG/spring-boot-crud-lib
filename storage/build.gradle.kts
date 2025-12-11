plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":crud"))
    api(libs.org.imgscalr.imgscalr.lib)
    api(project(":test-utils"))
}

group = "dev.funixgaming.spring.core.storage"
description = "storage"

java {
    withJavadocJar()
}
