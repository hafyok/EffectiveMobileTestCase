package com.example.effectivemobiletestcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.effectivemobiletestcase.Navigation.RootNavigationGraph
import com.example.effectivemobiletestcase.ui.theme.EffectiveMobileTestCaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EffectiveMobileTestCaseTheme {
                // A surface container using the 'background' color from the theme
                RootNavigationGraph(navHostController = rememberNavController())
            }
        }
    }
}