package com.example.pokedix.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GamesList (
    var game: GameTypes,
    var gameListUrls: GameImageUrls
): Parcelable

@Parcelize
data class GameImageUrls(
    var gameImage: String,
    var gameStartScreen: String,
    var pokemonImage: String,
    var itemsImage: String,
    var machinesImage: String
): Parcelable
