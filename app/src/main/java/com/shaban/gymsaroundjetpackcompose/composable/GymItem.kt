package com.shaban.gymsaroundjetpackcompose.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.shaban.gymsaroundjetpackcompose.data.Gym
import com.shaban.gymsaroundjetpackcompose.ui.theme.CardBackgroundColor

@Composable
fun GymItem(gym: Gym) {
    Card(
        elevation = CardDefaults.cardElevation(0.dp),
        modifier = Modifier.padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(CardBackgroundColor)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            GymIcon(Icons.Filled.Place, Modifier.weight(0.15F))
            GymDetails(gym, Modifier.weight(0.85F))
        }
    }
}