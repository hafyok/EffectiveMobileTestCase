package com.example.effectivemobiletestcase.Navigation


sealed class Screens(val route: String){
    object LoginScreenRoute : Screens(route = "LoginScreen")
    object HomeScreenRoute: Screens(route = "HomeScreen")
    object AuthRoute : Screens(route = "Auth")
    object AppRoute : Screens(route = "App")
}
/*
@Composable
fun Screen1() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Screen 1",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen2() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Screen 2",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen3() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Screen 3",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen4() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Screen 4",
        textAlign = TextAlign.Center
    )
}*/
