import de.fayard.refreshVersions.core.versionFor

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.posebasics.app"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.posebasics.app"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        dataBinding = true
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.compiler)
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(AndroidX.core.ktx)

    implementation(AndroidX.appCompat)
    implementation(AndroidX.constraintLayout)
    implementation(Google.android.material)

    implementation(AndroidX.navigation.fragmentKtx)
    implementation(AndroidX.navigation.uiKtx)

    implementation(AndroidX.lifecycle.runtime.ktx)

    implementation(AndroidX.activity.compose)
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.toolingPreview)
    implementation(AndroidX.compose.material3)
    debugImplementation(AndroidX.compose.ui.tooling)
    debugImplementation(AndroidX.compose.ui.testManifest)
    androidTestImplementation(AndroidX.compose.ui.testJunit4)

    implementation(libs.epoxy)
    implementation(libs.epoxy.databinding)
    kapt(libs.epoxy.processor)

    testImplementation(Testing.junit4)
    androidTestImplementation(AndroidX.test.ext.junit)
    androidTestImplementation(AndroidX.test.espresso.core)
}
