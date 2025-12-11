plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.spring.io/milestone")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api("org.projectlombok:lombok:1.18.38")
    api("com.google.code.gson:gson:2.13.1")
    api("com.google.guava:guava:33.4.8-jre")
    api("org.springframework.boot:spring-boot-configuration-processor:3.5.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.5.0")
    testImplementation("org.springframework.security:spring-security-test:6.5.0")
    testImplementation("com.h2database:h2:2.3.232")
    testImplementation("org.mockito:mockito-core:5.17.0")
    testImplementation("junit:junit:4.13.2")
}

group = "dev.funixgaming.spring.core"
version = "1.2.7"
java.sourceCompatibility = JavaVersion.VERSION_21

java {
    withSourcesJar()
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
