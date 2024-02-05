package com.example.effectivemobiletestcase.Navigation.bottomNav

import com.example.effectivemobiletestcase.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String){
    object Home: BottomItem("Главная", R.drawable.main_page, "HOME"/*Screens.HomeScreenRoute.route*/)
    object Catalog: BottomItem("Каталог", R.drawable.catalog, "CATALOG"/*Screens.CatalogScreenRoute.route*/)
    object Basket: BottomItem("Корзина", R.drawable.basket_two, "BasketScreen")
    object Sale: BottomItem("Акции", R.drawable.sale, "SaleScreen")
    object Profile: BottomItem("Профиль", R.drawable.profile, "ProfileScreen")
}