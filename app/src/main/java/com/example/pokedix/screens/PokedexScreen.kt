package com.example.pokedix.screens

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.Scaffold
import coil.compose.AsyncImage
import com.example.pokedix.R
import com.example.pokedix.models.PokemonDex
import com.example.pokedix.navigation.AppScreens
import com.example.pokedix.viewmodel.PokedexViewModel
import com.example.pokedix.viewmodel.flowstate.PokedexState
import com.google.gson.Gson


private var pokemonNumber = 1
@Composable
fun PokedexListScreen(navController: NavController, pokedexViewModel: PokedexViewModel, gameUrl: String, ){
    pokedexViewModel.fetchPokedex(gameUrl)
    Scaffold {
        PokedexBodyContent(pokedexViewModel, navController)
    }
}

@Composable
private fun PokedexBodyContent(pokedexViewModel: PokedexViewModel, navController: NavController){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.poke_back), contentDescription = stringResource(id = R.string.pokedex_background),
            contentScale = ContentScale.FillBounds , modifier = Modifier
                .matchParentSize())
        SetPokemonList(pokedexViewModel, navController)
    }
}

@Composable
private fun SetPokemonList(pokedexViewModel: PokedexViewModel, navController: NavController) {
    val data = pokedexViewModel.pokedexStateFlow.collectAsState(null)
    when(data.value){
        is PokedexState.Success -> {
            val pokedex = (data.value as? PokedexState.Success)?.pokedex.orEmpty()
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 120.dp), modifier = Modifier
                    .fillMaxSize()
            ) {
                items(pokedex) { pokemon ->
                    SetPokedex(pokemon, navController)
                }
            }
        }
        else -> Unit
    }
    pokemonNumber=0
}

@Composable
private fun SetPokedex(pokemonDex: PokemonDex, navController: NavController){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .clickable {
                val json = Uri.encode(Gson().toJson(pokemonDex))
                navController.navigate(AppScreens.PokemonScreen.route + "/$json")
            }
            .clip(CircleShape)
            .background(Color.DarkGray)) {
        AsyncImage(
            model = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$pokemonNumber.png",
            contentDescription = pokemonDex.pokemonName, modifier = Modifier
                .matchParentSize()
                .padding(start = 50.dp))
        AsyncImage(
            model = R.drawable.ball,
            contentDescription = pokemonDex.pokemonName, modifier = Modifier
                .size(52.dp)
                .background(Color.LightGray, CircleShape)
                .padding(2.dp))
    }

    pokemonNumber++
}