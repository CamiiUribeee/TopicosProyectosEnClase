package com.example.a7deoctubre.ui.theme.FirstScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(onButtonPressed: ()-> Unit, modifier: Modifier= Modifier){
    Column() {
        Text("First Screen", fontSize=25.sp)
        FilledTonalButton(onClick = onButtonPressed) {
            Text("Next")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstPreview(){
    FirstScreen(onButtonPressed = {})
}