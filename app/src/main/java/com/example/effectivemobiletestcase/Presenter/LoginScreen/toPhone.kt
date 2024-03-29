package com.example.effectivemobiletestcase.Presenter.LoginScreen

fun String.toPhone(): String{
    val phoneSplit = this.chunked(3)
    val formattedPhone = StringBuilder()

    for(i in 0 until phoneSplit.count()){
        if(i == 0)
            formattedPhone.append("+ 7 ${phoneSplit[i]}")
        if(i == 1)
            formattedPhone.append(" ${phoneSplit[i]}")
        if(i == 2)
            formattedPhone.append(" ${phoneSplit[i]}")
        if(i == 3)
            formattedPhone.append(phoneSplit[i])

    }
    return formattedPhone.toString()
}

