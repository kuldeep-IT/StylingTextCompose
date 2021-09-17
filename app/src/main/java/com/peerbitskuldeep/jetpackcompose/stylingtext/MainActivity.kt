package com.peerbitskuldeep.jetpackcompose.stylingtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.peerbitskuldeep.jetpackcompose.stylingtext.ui.theme.StylingTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Black)) {

                Text(
                    //String Builder
                    text = buildAnnotatedString {
                                                withStyle(
                                                    style = SpanStyle(
                                                        color = Color.Green,
                                                        fontSize = 70.sp,
                                                        FontWeight.Bold,
                                                        ),
                                                ){
                                                    append("K")
                                                }
                                                append("uldeep ")

                                                withStyle(
                                                    style = SpanStyle(
                                                        Color.Red,
                                                        fontSize = 70.sp,
                                                        FontWeight.Bold
                                                    )
                                                ){
                                                    append("R")
                                                }
                        append("athod") //below style applied
                                                },

//                    text = "Kuldeep Rathod",
                    color = Color.White,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}

