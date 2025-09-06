package com.makeappssimple.abhimanyu.cmp_8731.features.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
internal fun SettingsScreen() {
    Box(
        contentAlignment = Alignment.Companion.Center,
        modifier = Modifier.Companion.fillMaxSize(),
    ) {
        Text("Settings Content")
    }
}
