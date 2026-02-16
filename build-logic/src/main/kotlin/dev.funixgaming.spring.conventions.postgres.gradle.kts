plugins {
    id("dev.funixgaming.spring.conventions.service")
    id("org.flywaydb.flyway")
}

group = "dev.funixgaming.spring.conventions.postgres"
version = Versions.projectVersion

dependencies {
    api("org.postgresql:postgresql")
    api("org.flywaydb:flyway-core")
    api("org.flywaydb:flyway-database-postgresql")
}
