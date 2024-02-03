package com.example.effectivemobiletestcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.effectivemobiletestcase.Navigation.NavGraph
import com.example.effectivemobiletestcase.Presenter.LoginScreen.LoginViewModel
import com.example.effectivemobiletestcase.ui.theme.EffectiveMobileTestCaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EffectiveMobileTestCaseTheme {
                // A surface container using the 'background' color from the theme
                //MainScreen()
                NavGraph()
            }
        }
    }


}