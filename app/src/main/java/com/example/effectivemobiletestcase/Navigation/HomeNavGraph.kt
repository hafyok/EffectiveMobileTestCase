package com.example.effectivemobiletestcase.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.effectivemobiletestcase.Navigation.bottomNav.BottomItem
import com.example.effectivemobiletestcase.Presenter.BasketScreen
import com.example.effectivemobiletestcase.Presenter.CatalogScreen
import com.example.effectivemobiletestcase.Presenter.MainScreen
import com.example.effectivemobiletestcase.Presenter.ProfileScreen
import com.example.effectivemobiletestcase.Presenter.SaleScreen


@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomItem.Home.route
    ){
        composable(route = BottomItem.Home.route){
            MainScreen()
        }

        composable(route = BottomItem.Catalog.route){
            CatalogScreen()
        }

        composable(route = BottomItem.Basket.route){
            BasketScreen()
        }

        composable(route = BottomItem.Sale.route){
            SaleScreen()
        }

        composable(route = BottomItem.Profile.route){
            ProfileScreen()
        }
    }
}