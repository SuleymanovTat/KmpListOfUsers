package ru.suleymanovtat

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import data.Results

@Composable
fun HomeScreen(users: State<List<Results>>) {
    Text("Home screen ${users.value.size}")
}
