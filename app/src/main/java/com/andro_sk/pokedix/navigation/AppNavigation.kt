package com.andro_sk.pokedix.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.andro_sk.pokedix.extensions.GameTypeParam
import com.andro_sk.pokedix.extensions.PokemonTypeParam
import com.andro_sk.pokedix.models.Game
import com.andro_sk.pokedix.models.PokemonDex
import com.andro_sk.pokedix.ui.screens.GameOptionsScreen
import com.andro_sk.pokedix.ui.screens.GamesScreen
import com.andro_sk.pokedix.ui.screens.PokedexListScreen
import com.andro_sk.pokedix.ui.screens.PokemonScreen
import com.andro_sk.pokedix.viewmodel.PokedexViewModel

@Composable
fun AppNavigation(games: List<Game> = arrayListOf()){
    val navController = rememberNavController()

    val pokedexViewModel = remember {
        PokedexViewModel()
    }

    NavHost(navController = navController, startDestination = AppScreens.GamesScreen.route){
        composable(route = AppScreens.GamesScreen.route) {
            GamesScreen(games = games, navController = navController)
        }
        composable(route = AppScreens.GameOptionsScreen.route.plus("/{game}"),
            arguments = listOf(navArgument(name = "game") {
                type = GameTypeParam()
                defaultValue = Game()
            })
        ) {
            GameOptionsScreen(navController = navController, game =  it.arguments?.getParcelable("game")?:Game())
        }
        composable(route = AppScreens.PokedexScreen.route.plus("/{gameUrl}"), arguments = listOf(
            navArgument(name = "gameUrl"){
                type = NavType.StringType
                defaultValue = ""
            }
        )){
            PokedexListScreen(navController = navController, pokedexViewModel = pokedexViewModel, gameUrl = it.arguments?.getString("gameUrl").orEmpty())
        }
        composable(route = AppScreens.PokemonScreen.route.plus("/{pokemon}"),
            arguments = listOf(navArgument(name = "pokemon") {
                type = PokemonTypeParam()
                defaultValue = PokemonDex()
            })
        ) {
            PokemonScreen(navController = navController, it.arguments?.getParcelable("pokemon")?:PokemonDex())
        }
    }
}