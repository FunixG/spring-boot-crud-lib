plugins {
    id("dev.funixgaming.spring.conventions")
}

group = "dev.funixgaming.spring.conventions.service"
version = Versions.projectVersion

dependencies {
    implementation("org.mapstruct:mapstruct:${Versions.orgMapStructVersion}")
    testImplementation("org.mapstruct:mapstruct:${Versions.orgMapStructVersion}")

    annotationProcessor("org.mapstruct:mapstruct-processor:${Versions.orgMapStructVersion}")
    testAnnotationProcessor("org.mapstruct:mapstruct-processor:${Versions.orgMapStructVersion}")

    api("com.google.guava:guava:${Versions.comGoogleGuavaVersion}")

    api("org.springframework.boot:spring-boot-starter-actuator")
}
