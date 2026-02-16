
plugins {
    id("dev.funixgaming.spring.conventions.service")
}

group = "dev.funixgaming.spring.conventions.auth"
version = Versions.projectVersion

dependencies {
    api("org.springframework.security:spring-security-core")
    api("org.springframework.security:spring-security-config")
    api("org.springframework.security:spring-security-web")
    api("org.springframework.security:spring-security-crypto")

    api("io.jsonwebtoken:jjwt-api:${Versions.jjwtVersion}")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:${Versions.jjwtVersion}")
    api("io.jsonwebtoken:jjwt-gson:${Versions.jjwtVersion}")
}
