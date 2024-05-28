package ru.suleymanovtat

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import data.Results

@Composable
fun HomeScreen(users: List<Results>) {
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(users.size, key = {
            users[it].phone.toString()
        }) {
            val user = users[it]
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = rememberAsyncImagePainter(model = user.picture?.thumbnail),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(16.dp)
                        .size(50.dp)
                )
                Column(verticalArrangement = Arrangement.Center) {
                    Text(text = "${user.name?.first} ${user.name?.last}")
                    Text(text = user.phone.toString())
                }
            }
        }
    }
}
