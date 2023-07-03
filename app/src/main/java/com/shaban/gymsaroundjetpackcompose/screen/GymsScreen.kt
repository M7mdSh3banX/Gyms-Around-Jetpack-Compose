package com.shaban.gymsaroundjetpackcompose.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shaban.gymsaroundjetpackcompose.composable.GymItem
import com.shaban.gymsaroundjetpackcompose.data.dummyListOfGyms

@Composable
fun GymsScreen() {
    /* Column Iteration */
    /*Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        dummyListOfGyms.forEach { GymItem(it) }
    }*/

    /* Lazy Column */
    LazyColumn(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(dummyListOfGyms) { gym ->
            GymItem(gym)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewGymsScreen() {
    GymsScreen()
}