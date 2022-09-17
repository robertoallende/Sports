package com.sportsworld.learnsharedflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sportsworld.learnsharedflow.ui.theme.LearnSharedFlowTheme
import androidx.compose.runtime.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import com.sportsworld.sportcomponentlib.DisplayScreenSetup



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnSharedFlowTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        //This will be in other apps
                        topBar = {topBar()},
                        // This will be supplied by the SportsFeature library - once I refactor to create one..
                        content = {DisplayScreenSetup()}
                    )

                    }

                }
            }
        }
    }

@Composable
fun topBar() {
    TopAppBar(title = {
        Text(
            text = "Featured Sport",
            style = MaterialTheme.typography.h6,
        )
    })
}

