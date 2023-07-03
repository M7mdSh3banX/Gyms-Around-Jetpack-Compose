package com.shaban.gymsaroundjetpackcompose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.shaban.gymsaroundjetpackcompose.data.Gym
import com.shaban.gymsaroundjetpackcompose.ui.theme.Purple40

@Composable
fun GymDetails(
    gym: Gym,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = gym.name,
            style = MaterialTheme.typography.headlineSmall,
            color = Purple40
        )
        Text(
            text = gym.place,
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}
