plugins {
    id("buildlogic-spring-service.java-conventions")
}

group = "dev.funixgaming.spring.core.crud"
description = "crud"

dependencies {
    api(project(":exceptions"))
    api(project(":tools"))
    testImplementation(project(":test-utils"))
}
