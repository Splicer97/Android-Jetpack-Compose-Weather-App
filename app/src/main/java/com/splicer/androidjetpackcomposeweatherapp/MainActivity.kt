package com.splicer.androidjetpackcomposeweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.splicer.androidjetpackcomposeweatherapp.screens.MainCard
import com.splicer.androidjetpackcomposeweatherapp.screens.TabLayout
import com.splicer.androidjetpackcomposeweatherapp.ui.theme.AndroidJetpackComposeWeatherAppTheme

const val API_KEY = "b0676713ebfe49efbf8174320221907 "

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeWeatherAppTheme {
                Image(
                    painter = painterResource(
                        id = R.drawable.weather_bg
                    ),
                    contentDescription = "im1",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5f),
                    contentScale = ContentScale.FillBounds
                )
                Column {
                    MainCard()
                    TabLayout()
                }
            }
        }
    }
}
