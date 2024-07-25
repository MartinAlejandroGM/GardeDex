package com.example.pokedix.screens

import android.net.Uri
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.Scaffold
import coil.compose.AsyncImage
import com.example.pokedix.models.Game
import com.example.pokedix.navigation.AppScreens

@Composable
fun GameOptionsScreen(navController: NavController, game: Game) {
    Log.e("el juego trae", game.gameListUrls.startScreen)

    Scaffold {
        BodyContent(game, navController)
    }
}

@Composable
private fun BodyContent(game: Game, navController: NavController){
    Box(modifier = Modifier.fillMaxSize()){
        AsyncImage(model = game.gameListUrls.startScreen,
            contentDescription = game.name,
            contentScale = ContentScale.FillBounds, modifier = Modifier
                .matchParentSize())
        SetGameOptions(game, navController)
    }
}

@Composable
private fun SetGameOptions(game: Game, navController: NavController){
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 300.dp), contentPadding = PaddingValues(16.dp), modifier = Modifier
        .fillMaxSize()) {
        item {
            SetPokemons(game.gameListUrls.pokemonImage, gameUrl = game.url, navController)
        }
        item {
            SetItems(game.gameListUrls.itemsImage, navController)
        }
        item {
            SetMachines(game.gameListUrls.machinesImage, navController)
        }
    }
}

@Composable
private fun SetPokemons(pokemonsUrl: String, gameUrl: String, navController: NavController){
    AsyncImage(model = pokemonsUrl,
        contentDescription = "Dex",
        contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize().clickable {
            navController.navigate(route = AppScreens.PokedexScreen.route + "/${Uri.encode(gameUrl)}")
        }.padding(bottom = 16.dp))
}

@Composable
private fun SetItems(itemsUrl: String, navController: NavController){
    AsyncImage(model = itemsUrl,
        contentDescription = "Dex",
        contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize().padding(bottom = 16.dp))
}

@Composable
private fun SetMachines(machinesUrl: String, navController: NavController){
    AsyncImage(model = machinesUrl,
        contentDescription = "Dex",
        contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize().padding(bottom = 16.dp))

}