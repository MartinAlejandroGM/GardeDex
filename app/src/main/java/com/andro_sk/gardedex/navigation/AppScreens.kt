package com.andro_sk.gardedex.navigation

sealed class AppScreens(val route: String) {
    data object GamesScreen: AppScreens("games_screen")
    data object GameOptionsScreen: AppScreens("game_option_screen")
    data object PokedexScreen: AppScreens("pokedex_screen")
    data object PokemonScreen: AppScreens("pokemon_screen")
}
