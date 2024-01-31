package com.example.effectivemobiletestcase.Presenter.LoginScreen

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.effectivemobiletestcase.R
import com.example.effectivemobiletestcase.ui.theme.black


@Preview
@Composable
fun PhoneVisualTransformation() {
    var phoneNumber by rememberSaveable { mutableStateOf("") }
    OutlinedTextField(
        value = phoneNumber,
        onValueChange = { phoneNumber = it },
        label = {
            Text(
                stringResource(id = R.string.userNumber),
                style = TextStyle(fontSize = 16.sp),
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        textStyle = TextStyle(fontSize = 16.sp, color = black),
        modifier = Modifier.fillMaxWidth(),
        visualTransformation = {
            mobileNumberFilter(it)
        }
    )
}

//TODO: в поле номера телефона можно ввести букву, это надо исправить

fun mobileNumberFilter(text: AnnotatedString): TransformedText{
    val formattedPhone = text.text.toPhone()
    val origToTransformedText = formattedPhone.length
    val formattedCharacterCount = formattedPhone.filterNot {
        it.isDigit()
    }.count()

    val annotatedString = AnnotatedString(formattedPhone)

    val phoneNumberOffsetTranslator = object : OffsetMapping{
        override fun originalToTransformed(offset: Int): Int = origToTransformedText

        override fun transformedToOriginal(offset: Int): Int {
            Log.d("transOffset", "transOffset: $offset")
            return if (offset > 3) offset - formattedCharacterCount
            else offset
        }
    }

    return TransformedText(annotatedString, phoneNumberOffsetTranslator)
}