package com.example.effectivemobiletestcase.Presenter.LoginScreen

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.effectivemobiletestcase.R
import com.example.effectivemobiletestcase.ui.theme.grey
import com.example.effectivemobiletestcase.ui.theme.light_pink
import com.example.effectivemobiletestcase.ui.theme.white

@Preview
@Composable
fun LoginScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ){
        Text(
            text = stringResource(R.string.login_screen_title),
            style = TextStyle(fontSize = 16.sp),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        NameInputValidation()

        Spacer(modifier = Modifier.height(8.dp))

        LastNameInputValidation()

        Spacer(modifier = Modifier.height(8.dp))

        PhoneVisualTransformation()

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Действие при нажатии */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(size = 8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = light_pink)
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