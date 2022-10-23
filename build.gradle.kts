import com.diffplug.gradle.spotless.SpotlessExtension
import com.diffplug.gradle.spotless.SpotlessExtensionPredeclare

buildscript {
    dependencies {
        classpath(AndroidX.navigation.safeArgsGradlePlugin)
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.3.1" apply false
    id("com.android.library") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("com.diffplug.spotless") version "6.11.0"
}

subprojects {
    afterEvaluate {
        apply(plugin = "com.diffplug.spotless")

        configure<SpotlessExtension> {
            kotlin {
                target("**/*.kt")
                targetExclude("$buildDir/**/*.kt", "bin/**/*.kt")
                ktlint(libs.versions.ktlint.get()).userData(
                    mapOf(
                        "android" to "true",
                        "disabled_rules" to "max-line-length",
                    )
                )
                trimTrailingWhitespace()
                endWithNewline()
            }
            format("misc") {
                target("**/*.kts", "**/*.gradle", "**/*.xml", "**/*.md", "**/.gitignore")
                targetExclude("**/build/**/*.kts", "**/build/**/*.xml")
                trimTrailingWhitespace()
                indentWithSpaces(4)
                endWithNewline()
            }
        }
    }
}

configure<SpotlessExtension> {
    predeclareDeps()
}

configure<SpotlessExtensionPredeclare> {
    kotlin { ktlint(libs.versions.ktlint.get()) }
}
