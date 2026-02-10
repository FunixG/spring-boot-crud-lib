plugins {
    id("buildlogic.java-conventions")
}

group = "dev.funixgaming.spring.core.tools"
description = "tools"

dependencies {
    api(project(":exceptions"))
    api(libs.com.google.guava)
    api("org.springframework.boot:spring-boot-starter-websocket")
}

java {
    withJavadocJar()
}
