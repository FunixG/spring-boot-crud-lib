plugins {
    id("dev.funixgaming.spring.conventions.service")
}

group = "dev.funixgaming.spring.core.crud"
description = "crud"

dependencies {
    api(project(":exceptions"))
    api(project(":tools"))
    testImplementation(project(":test-utils"))
}
