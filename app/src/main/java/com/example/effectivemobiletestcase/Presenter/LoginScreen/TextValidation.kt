package com.example.effectivemobiletestcase.Presenter.LoginScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.effectivemobiletestcase.Domain.canEnter
import com.example.effectivemobiletestcase.R
import com.example.effectivemobiletestcase.ui.theme.black


@Composable
fun NameInputValidation(updateBtnCanEnter: () -> Unit) {
    var firstName by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }
    val trailingIconView = @Composable {
        IconButton(
            onClick = {
                firstName = ""
            },
        ) {
            Icon(
                Icons.Default.Clear,
                contentDescription = "",
                tint = Color.Black
            )
        }
    }

    OutlinedTextField(
        value = firstName,
        onValueChange = {
            if (it.matches(Regex("[a-zA-Z]+"))) {
                isError = true
                canEnter.isValidateName = false
                updateBtnCanEnter()
            } else {
                firstName = it
                isError = false
                canEnter.isValidateName = true
                updateBtnCanEnter()
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
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = if (firstName.isNotBlank()) trailingIconView else null
    )

    if (isError) {
        Text(
            text = stringResource(id = R.string.trigger),
            color = Color.Red,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Composable
fun LastNameInputValidation(updateBtnCanEnter: () -> Unit) {
    var lastName by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }
    val trailingIconView = @Composable {
        IconButton(
            onClick = {
                lastName = ""
            },
        ) {
            Icon(
                Icons.Default.Clear,
                contentDescription = "",
                tint = Color.Black
            )
        }
    }

    OutlinedTextField(
        value = lastName,
        onValueChange = {
            if (it.matches(Regex("[a-zA-Z]+"))) {
                isError = true
                canEnter.isValidateName = false
                updateBtnCanEnter()

            } else {
                lastName = it
                isError = false
                canEnter.isValidateLastName = true
                updateBtnCanEnter()
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
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = if (lastName.isNotBlank()) trailingIconView else null
    )

    if (isError) {
        Text(
            text = stringResource(id = R.string.trigger),
            color = Color.Red,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}