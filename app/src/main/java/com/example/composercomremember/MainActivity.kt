package com.example.composercomremember

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composercomremember.ui.theme.ComposercomrememberTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxBody()
        }
    }
}

@Composable
fun BoxBody() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(255, 255, 255))

    ){

        var textfield1: String by remember { mutableStateOf("") }
        TextField(value = textfield1,
            onValueChange = {textfield1},

            //começo placeholder
            placeholder = {
                Text(
                    text = "Digite sua senha para acessar a home",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
            },
            //final placeholder

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .padding(horizontal = 10.dp)
        )//final textfield

        //Começo segundo textfield
        var textfield2: String by remember { mutableStateOf("")
        }
        TextField(
            value = textfield2 ,
            onValueChange ={textfield2 = it},
            modifier = Modifier
            .fillMaxWidth()
            .padding(top= 100.dp)
            .padding(horizontal = 10.dp),
            textStyle = TextStyle(fontFamily = FontFamily.Cursive, color = Color.Blue),



        )





    }//final box


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BoxBody()
}