package com.example.effectivemobiletestcase.Presenter.LoginScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.effectivemobiletestcase.R
import com.example.effectivemobiletestcase.ui.theme.black


@Composable
fun NameInputValidation() {
    var firstName by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = firstName,
        onValueChange = {
            if (it.matches(Regex("[а-яА-ЯёЁ]+"))) {
                firstName = it
                isError = false
            } else {
                isError = true
            }
        },
        label = {
            Text(
                stringResource(id = R.string.firstName),
                style = TextStyle(fontSize = 16.sp),
            )
        },
        textStyle = TextStyle(fontSize = 16.sp, color = black),
        isError = isError,
        singleLine = true,
        modifier = Modifier.fillMaxWidth()
    )

    if (isError) {
        Text(
            text = "Поле должно содержать только буквы кириллицы",
            color = Color.Red,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

//TODO: поправить шрифты и цвета

@Composable
fun LastNameInputValidation() {
    var lastName by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = lastName,
        onValueChange = {
            if (it.matches(Regex("[а-яА-ЯёЁ]+"))) {
                lastName = it
                isError = false
            } else {
                isError = true
            }
        },
        label = {
            Text(
                stringResource(id = R.string.secondName),
                style = TextStyle(fontSize = 16.sp),
            )
        },
        textStyle = TextStyle(fontSize = 16.sp, color = black),
        isError = isError,
        singleLine = true,
        modifier = Modifier.fillMaxWidth()
    )

    if (isError) {
        Text(
            text = "Поле должно содержать только буквы кириллицы",
            color = Color.Red,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

/*
@Composable
fun NumberInputValidation() {
    var phoneNumber by remember { mutableStateOf("") }

    OutlinedTextField(
        value = phoneNumber,
        onValueChange = {
            val formattedNumber = formatPhoneNumber(it)
            phoneNumber = formattedNumber
        },
        label = {
            Text(
                "Номер телефона",
                style = TextStyle(fontSize = 16.sp)
            )
        },
        textStyle = TextStyle(fontSize = 16.sp),
        singleLine = true,
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        trailingIcon = {
            if (phoneNumber.isNotEmpty()) {
                IconButton(onClick = { phoneNumber = "" }) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = "Clear",
                        //tint = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
                    )
                }
            }
        }
    )
}
*/

