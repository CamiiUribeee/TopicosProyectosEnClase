package com.example.a7deoctubre.ui.theme.SecondScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(onButtonPressed: ()-> Unit, modifier: Modifier= Modifier){
    Column() {
        Text("Second Screen", fontSize=25.sp)
        FilledTonalButton(onClick = onButtonPressed) {
            Text("Back to home")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview(){
    SecondScreen(onButtonPressed = {})
}