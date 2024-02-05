package com.example.effectivemobiletestcase.Navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.effectivemobiletestcase.Presenter.LoginScreen.LoginScreen

fun NavGraphBuilder.authNavGraph(navHostController: NavHostController){
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(
                onClickHome = {
                    navHostController.popBackStack()
                    navHostController.navigate(Graph.HOME)
                }
            )
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
}