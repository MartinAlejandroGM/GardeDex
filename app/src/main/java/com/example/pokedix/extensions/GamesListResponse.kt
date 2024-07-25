package com.example.pokedix.extensions

import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.Game

fun GameListResponse.toGamesList(): List<Game> {
    return results.map { result ->
        Game(
            result.name.toValidNameFormat(),
            result.name.getUrlsByGameName(),
            result.url
        )
    }
}