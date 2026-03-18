package com.example.laba12.model

import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val imageId: Int,
    val pointPerClick: Int,
    val threshold: Int
)