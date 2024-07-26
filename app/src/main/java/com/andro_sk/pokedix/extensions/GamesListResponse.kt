package com.andro_sk.pokedix.extensions

import com.andro_sk.pokedix.models.GameListResponse
import com.andro_sk.pokedix.models.Game

fun GameListResponse.toGamesList(): List<Game> {
    return results.map { result ->
        Game(
            result.name.toValidNameFormat(),
            result.name.getUrlsByGameName(),
            result.url
        )
    }
}