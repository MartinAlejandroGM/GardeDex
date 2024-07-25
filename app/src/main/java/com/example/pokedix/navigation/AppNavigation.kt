package com.example.pokedix.navigation

import android.content.res.Resources
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pokedix.extensions.GameTypeParam
import com.example.pokedix.extensions.PokemonTypeParam
import com.example.pokedix.models.Game
import com.example.pokedix.models.Pokemon
import com.example.pokedix.models.PokemonDex
import com.example.pokedix.screens.GameOptionsScreen
import com.example.pokedix.screens.GamesScreen
import com.example.pokedix.screens.PokedexListScreen
import com.example.pokedix.screens.PokemonScreen
import com.example.pokedix.viewmodel.PokedexViewModel

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
            PokedexListScreen(navController = navController, pokedexViewModel = pokedexViewModel, gameUrl = it.arguments?.getString("gameUrl")?:"")
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