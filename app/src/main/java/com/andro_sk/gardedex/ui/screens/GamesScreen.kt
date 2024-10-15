package com.andro_sk.gardedex.ui.screens

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text
import coil.compose.AsyncImage
import com.andro_sk.gardedex.R
import com.andro_sk.gardedex.models.Game
import com.andro_sk.gardedex.navigation.AppScreens
import com.google.gson.Gson

@Composable
fun GamesScreen(games: List<Game>, navController: NavController){
    Scaffold {
        BodyContent(games, navController)
    }
}

@Composable
private fun BodyContent(games: List<Game>, navController: NavController){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.poke_back),
            contentDescription = stringResource(id = R.string.games_background),
            contentScale = ContentScale.FillBounds , modifier = Modifier
                .matchParentSize())
        SetGameList(games, navController)
    }
}

@Composable
private fun SetGameList(games: List<Game>, navController: NavController) {
    LazyColumn {
        items(games) { game ->
            SetGameCards(game, navController)
        }
    }
}

@Composable
private fun SetGameCards(game: Game, navController: NavController){
    val json = Uri.encode(Gson().toJson(game))
    Box(modifier = Modifier
        .padding(16.dp)
        .clickable(onClick = {
            navController.navigate(
            route = AppScreens.GameOptionsScreen.route + "/$json") })) {
        AsyncImage(model = game.gameListUrls.image,
            contentDescription = game.name,
            contentScale = ContentScale.FillBounds, modifier = Modifier
                .fillMaxSize())
        Text(text = game.name, modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.LightGray))
    }
}