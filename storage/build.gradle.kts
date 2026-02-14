plugins {
    id("buildlogic-spring-service.java-conventions")
}

group = "dev.funixgaming.spring.core.storage"
description = "storage"

dependencies {
    api(project(":crud"))
    implementation(libs.org.imgscalr.imgscalr.lib)
}
