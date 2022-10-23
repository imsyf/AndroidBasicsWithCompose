package com.posebasics.app.toc

import androidx.annotation.DrawableRes

data class PathwayProps(
    val id: Int,
    @DrawableRes val badge: Int,
    val title: String,
    val description: String,
)
