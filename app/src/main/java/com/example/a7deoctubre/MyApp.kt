package com.example.a7deoctubre

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.ui.NavDisplay
import com.example.a7deoctubre.ui.theme.FirstScreen.FirstScreen
import com.example.a7deoctubre.ui.theme.ScreenKeys.FirstRoute
import com.example.a7deoctubre.ui.theme.ScreenKeys.SecondRoute


@Composable
fun MyApp() {
    val backStack = remember {
        mutableStateListOf<Any>(FirstRoute)
    }
    NavDisplay(
        backStack = backStack,
        onBack = {
            backStack.removeLastOrNull()
        },
        entryProvider = { key ->
            when (key) {
                is FirstRoute -> NavEntry(key) {
                    FirstScreen(
                        onButtonPressed = {backStack.add(SecondRoute)}
                    )
                }
                is SecondRoute -> NavEntry(key) {
                    SecondScreen(
                        onButtonPressed = {backStack.add(FirstRoute)}
                    )
                }
                else -> NavEntry(key) {
                    Text("Ruta desconocida.")
                }
            }
        }
    )
}