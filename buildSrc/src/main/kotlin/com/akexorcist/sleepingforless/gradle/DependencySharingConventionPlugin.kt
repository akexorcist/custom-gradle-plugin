package com.akexorcist.sleepingforless.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class DependencySharingConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            dependencies {
                "implementation"("androidx.core:core-ktx:1.12.0")
                "implementation"("androidx.appcompat:appcompat:1.6.1")
                "implementation"("androidx.activity:activity-ktx:1.8.0")
                "implementation"("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
                "implementation"("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
                "implementation"("com.google.android.material:material:1.8.0")
                "implementation"("androidx.constraintlayout:constraintlayout:2.1.4")
                "implementation"("androidx.recyclerview:recyclerview:1.3.1")
                "implementation"("androidx.cardview:cardview:1.0.0")
            }
        }
    }
}