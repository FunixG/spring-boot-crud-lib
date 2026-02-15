plugins {
    id("dev.funixgaming.spring.conventions.service")
}

group = "dev.funixgaming.spring.core.storage"
description = "storage"

dependencies {
    api(project(":crud"))
    api(project(":exceptions"))
    api(project(":tools"))
    testImplementation(project(":test-utils"))

    implementation("org.imgscalr:imgscalr-lib:${Versions.imageScalerVersion}")
}
