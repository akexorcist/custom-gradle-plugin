package com.akexorcist.sleepingforless.gradle

import com.android.build.api.dsl.ApplicationExtension
import com.google.firebase.perf.plugin.FirebasePerfExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class FirebaseConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.google.gms.google-services")
                apply("com.google.firebase.firebase-perf")
                apply("com.google.firebase.crashlytics")
            }

            extensions.configure<ApplicationExtension> {
                buildTypes.configureEach {
                    if (name == "debug") {
                        configure<FirebasePerfExtension> {
                            setInstrumentationEnabled(false)
                        }
                    }
                }
            }

            dependencies {
                "implementation"("com.google.firebase:firebase-crashlytics-ktx:18.2.0")
                "implementation"("com.google.firebase:firebase-perf-ktx:20.4.1")
            }
        }
    }
}