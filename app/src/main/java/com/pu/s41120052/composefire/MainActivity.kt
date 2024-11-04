package com.pu.s41120052.composefire

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pu.s41120052.composefire.ui.theme.ComposeFireTheme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.material3.Button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeFireTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding->

                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )

                     */
                    Birth(m = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Birth(m: Modifier){
    var userName by remember { mutableStateOf("廖翊婷")}

    Column {
        TextField(
            value = userName,
            onValueChange = { newText ->
                userName = newText
            },
            modifier = m,
            label = { Text("姓名") },
            placeholder = { Text("請輸入您的姓名") }

        )

        Text("您輸入的姓名是：$userName")
    }


}

