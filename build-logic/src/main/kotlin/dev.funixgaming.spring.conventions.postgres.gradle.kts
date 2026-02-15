plugins {
    id("dev.funixgaming.spring.conventions.service")
    id("org.flywaydb.flyway")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

group = "dev.funixgaming.spring.conventions.postgres"
version = libs.findVersion("project.version").get().toString()

dependencies {
    api("org.postgresql:postgresql")
}
