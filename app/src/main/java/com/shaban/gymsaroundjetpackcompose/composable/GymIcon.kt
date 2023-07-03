package com.shaban.gymsaroundjetpackcompose.composable

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector


@Composable
fun GymIcon(vector: ImageVector, modifier: Modifier) {
    Image(
        imageVector = vector,
        contentDescription = "Gym Icon",
        modifier = modifier,
        colorFilter = ColorFilter.tint(Color.DarkGray)
    )
}