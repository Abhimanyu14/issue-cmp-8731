package com.makeappssimple.abhimanyu.cmp_8731.features.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
internal fun HomeScreen(
    openSettings: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Companion.Center,
        modifier = Modifier.Companion.fillMaxSize(),
    ) {
        Button(
            onClick = {
                openSettings()
            },
        ) {
            Text("Open Settings")
        }
    }
}
