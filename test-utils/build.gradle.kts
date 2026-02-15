plugins {
    id("dev.funixgaming.spring.conventions")
}

group = "dev.funixgaming.spring.core.test"
description = "test-utils"

dependencies {
    implementation("com.google.code.gson:gson:${Versions.comGoogleGsonVersion}")
}
