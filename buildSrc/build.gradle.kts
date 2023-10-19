repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("com.android.tools.build:gradle:8.1.2")
    implementation("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin:1.9.10")
    implementation("com.google.gms:google-services:4.4.0")
    implementation("com.google.firebase:perf-plugin:1.4.2")
    implementation("com.google.firebase:firebase-crashlytics-gradle:2.9.9")
}

gradlePlugin {
    plugins {
        register("dependencySharingConventionPlugin") {
            id = "akexorcist.dependency-sharing.convention"
            implementationClass = "com.akexorcist.sleepingforless.gradle.DependencySharingConventionPlugin"
        }
    }
    plugins {
        register("firebaseConventionPlugin") {
            id = "akexorcist.firebase.convention"
            implementationClass = "com.akexorcist.sleepingforless.gradle.FirebaseConventionPlugin"
        }
    }
    plugins {
        register("libraryConventionPlugin") {
            id = "akexorcist.library.convention"
            implementationClass = "com.akexorcist.sleepingforless.gradle.LibraryConventionPlugin"
        }
    }
}