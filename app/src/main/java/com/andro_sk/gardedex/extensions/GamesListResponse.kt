package com.andro_sk.gardedex.extensions

import com.andro_sk.gardedex.models.GameListResponse
import com.andro_sk.gardedex.models.Game

fun GameListResponse.toGamesList(): List<Game> {
    return results.map { result ->
        Game(
            result.name.toValidNameFormat(),
            result.name.getUrlsByGameName(),
            result.url
        )
    }
}