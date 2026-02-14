plugins {
    id("buildlogic-spring-service.java-conventions")
    id("org.flywaydb.flyway")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

group = "dev.funixgaming.spring.core.plugins.postgres"
version = libs.findVersion("project.version").get().toString()

dependencies {
    api("org.postgresql:postgresql")
}
