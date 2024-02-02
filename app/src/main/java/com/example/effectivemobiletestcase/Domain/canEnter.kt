package com.example.effectivemobiletestcase.Domain

object canEnter{
    var isValidateName = false
    var isValidateLastName = false
    var isValidatePhoneNumber = false

    var userName: String = ""
    var userLastName: String = ""
    var phoneNumber: String = ""

    val isEnter: Boolean
        get() = isValidateLastName && isValidateName && isValidatePhoneNumber
}