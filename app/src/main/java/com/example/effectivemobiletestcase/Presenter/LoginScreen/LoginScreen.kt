package com.example.effectivemobiletestcase.Presenter.LoginScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.effectivemobiletestcase.Domain.canEnter
import com.example.effectivemobiletestcase.R
import com.example.effectivemobiletestcase.ui.theme.grey
import com.example.effectivemobiletestcase.ui.theme.light_pink
import com.example.effectivemobiletestcase.ui.theme.pink
import com.example.effectivemobiletestcase.ui.theme.white

@SuppressLint("UnrememberedMutableState")
@Preview
@Composable
fun LoginScreen(loginViewModel: LoginViewModel = viewModel(factory = LoginViewModel.factory)) {
    //val listNames = loginViewModel.itemsList.collectAsState(initial = emptyList())
    var btnCanEnter by remember {
        mutableStateOf(canEnter.isEnter)
    }

    var btnColor by remember {
        mutableStateOf(if (btnCanEnter) pink else light_pink)
    }

    fun updateBtnCanEnter() {
        btnCanEnter = canEnter.isEnter
    }

    //val viewModel: LoginViewModel = viewModel()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ){
        Text(
            text = stringResource(R.string.login_screen_title),
            style = TextStyle(fontSize = 16.sp,
                lineHeight = 20.8.sp,
                fontWeight = FontWeight(500)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 15.dp)
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center
    ) {


        NameInputValidation { updateBtnCanEnter() }

        Spacer(modifier = Modifier.height(8.dp))

        LastNameInputValidation { updateBtnCanEnter() }

        Spacer(modifier = Modifier.height(8.dp))

        PhoneVisualTransformation { updateBtnCanEnter() }

        Spacer(modifier = Modifier.height(16.dp))

        // Весьма тяжелый костыль
        LaunchedEffect(btnCanEnter) {
            btnColor = if (btnCanEnter) pink else light_pink
        }
        Button(
            onClick = {

            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(size = 8.dp),
            colors = ButtonDefaults.buttonColors(btnColor)
        ) {
            Text(stringResource(id = R.string.input), color = white)
        }

        Spacer(modifier = Modifier.height(16.dp))
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(

            text = buildAnnotatedString {
                append(
                    "Нажимая кнопку \"${stringResource(id = R.string.input)}\", " +
                            "Вы принимаете условия программы лояльности"
                )
                addStyle(
                    style = SpanStyle(
                        textDecoration = TextDecoration.Underline
                    ),
                    start = 38,
                    end = 66
                )

            },
            color = grey,
            fontSize = 10.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()

        )
    }
}
