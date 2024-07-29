package com.andro_sk.pokedix.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game (
    var name: String = "",
    var gameListUrls: GameImageUrls = GameImageUrls(),
    var url: String = ""
): Parcelable

@Parcelize
data class GameImageUrls(
    var image: String = "",
    var startScreen: String = "",
    var pokemonImage: String = "",
    var itemsImage: String = "",
    var machinesImage: String = ""
): Parcelable
