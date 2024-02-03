package com.example.effectivemobiletestcase.Navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.effectivemobiletestcase.Presenter.LoginScreen.LoginScreen

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation(Screens.LoginScreenRoute.route, route = Screens.AuthRoute.route){
        composable(route = Screens.LoginScreenRoute.route){
            LoginScreen(navController = navController)
        }
    }
}