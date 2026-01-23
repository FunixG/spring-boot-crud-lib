plugins {
    id("buildlogic.java-conventions")
}

group = "dev.funixgaming.spring.core.tools"
description = "tools"

dependencies {
    api(project(":exceptions"))
    implementation(libs.com.google.guava)
    implementation("org.springframework.boot:spring-boot-starter-websocket")
}

java {
    withJavadocJar()
}
