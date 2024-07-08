package com.example.pokedix.extensions

import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.GameList

fun GameListResponse.toGamesList(): List<GameList> {
    return results.map { result ->
        GameList(
            result.name.toValidNameFormat(),
            result.name.getUrlsByGameName(),
            result.url
        )
    }
}