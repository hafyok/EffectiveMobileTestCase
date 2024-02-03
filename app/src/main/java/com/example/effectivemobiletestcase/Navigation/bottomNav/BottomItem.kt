package com.example.effectivemobiletestcase.Navigation.bottomNav

import com.example.effectivemobiletestcase.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String){
    object Screen1: BottomItem("Главная", R.drawable.main_page, "screen_1")
    object Screen2: BottomItem("Каталог", R.drawable.catalog, "screen_2")
    object Screen3: BottomItem("Корзина", R.drawable.basket_two, "screen_3")
    object Screen4: BottomItem("Акции", R.drawable.sale, "screen_4")
    object Screen5: BottomItem("Профиль", R.drawable.profile, "screen_5")
}