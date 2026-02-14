plugins {
    id("buildlogic-spring-service.java-conventions")
    id("org.flywaydb.flyway")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    api("org.postgresql:postgresql")
}
