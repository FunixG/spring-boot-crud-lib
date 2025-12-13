plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":exceptions"))
    implementation(libs.com.google.guava)
    implementation("org.springframework.boot:spring-boot-starter-websocket")
}

group = "dev.funixgaming.spring.core.tools"
description = "tools"

java {
    withJavadocJar()
}
