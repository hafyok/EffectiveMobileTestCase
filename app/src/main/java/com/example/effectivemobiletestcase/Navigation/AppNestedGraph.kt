package com.example.effectivemobiletestcase.Navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.effectivemobiletestcase.Presenter.Home.HomeScreen

fun NavGraphBuilder.appGraph(navController: NavController){
    navigation(startDestination = Screens.HomeScreenRoute.route, route = Screens.AppRoute.route){
        composable(route = Screens.HomeScreenRoute.route){
            HomeScreen(navController = navController)
        }
        
    }
}