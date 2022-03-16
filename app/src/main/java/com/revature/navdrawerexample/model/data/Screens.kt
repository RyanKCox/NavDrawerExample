package com.revature.navdrawerexample.model.data


sealed class Screen(val title:String,val route:String){

    object Home:Screen("Home","home")
    object Account:Screen("Account","account")
    object Help:Screen("Help","help")
}

val Screens= listOf<Screen>(

    Screen.Home,
    Screen.Account,
    Screen.Help
)