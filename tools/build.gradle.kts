plugins {
    id("dev.funixgaming.spring.conventions")
}

group = "dev.funixgaming.spring.core.tools"
description = "tools"

dependencies {
    api(project(":exceptions"))
    api("com.google.guava:guava:${Versions.comGoogleGuavaVersion}")
    api("org.springframework.boot:spring-boot-starter-websocket")
}
