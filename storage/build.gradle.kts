plugins {
    id("buildlogic-spring-service.java-conventions")
}

group = "dev.funixgaming.spring.core.storage"
description = "storage"

dependencies {
    api(project(":crud"))
    api(project(":exceptions"))
    api(project(":tools"))
    testImplementation(project(":test-utils"))

    implementation(libs.org.imgscalr.imgscalr.lib)
}
