package com.example.effectivemobiletestcase.Domain

object canEnter{
    var isValidateName = false
    var isValidateLastName = false
    var isValidatePhoneNumber = false

    val isEnter: Boolean
        get() = isValidateLastName && isValidateName && isValidatePhoneNumber
}