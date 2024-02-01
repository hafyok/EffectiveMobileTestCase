package com.example.effectivemobiletestcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.effectivemobiletestcase.Presenter.LoginScreen.LoginScreen
import com.example.effectivemobiletestcase.ui.theme.EffectiveMobileTestCaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EffectiveMobileTestCaseTheme {
                // A surface container using the 'background' color from the theme
                LoginScreen()
            }
        }
    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EffectiveMobileTestCaseTheme {
        Greeting("Android")
    }
}