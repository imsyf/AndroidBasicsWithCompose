package com.posebasics.app.data

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes

data class CourseUnit(
    val id: Int,
    val title: String,
    val description: String,
    val pathways: List<Pathway>,
)

data class Pathway(
    val id: Int,
    @DrawableRes val badge: Int,
    val title: String,
    val description: String,
    val published: String,
    val demos: List<Demo>,
)

enum class DemoType {
    Codelab,
    Practice,
    Project,
}

data class Demo(
    @IdRes val route: Int? = null,
    val type: DemoType,
    val title: String,
    val description: String,
)
