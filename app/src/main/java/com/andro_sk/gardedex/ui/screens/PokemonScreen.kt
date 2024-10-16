package com.andro_sk.gardedex.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.wear.compose.material.Text
import com.andro_sk.gardedex.models.PokemonDex

@Composable
fun PokemonScreen(navController: NavController, pokemon: PokemonDex){
    BodyContent(pokemon)
}

@Composable
private fun BodyContent(pokemon: PokemonDex){
    Dialog(onDismissRequest = { /*TODO*/ }) {
        Text(text = pokemon.pokemonName)
    }
}