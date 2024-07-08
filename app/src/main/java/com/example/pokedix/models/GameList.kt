package com.example.pokedix.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GameList (
    var name: String,
    var gameListUrls: GameImageUrls,
    var url: String
): Parcelable

@Parcelize
data class GameImageUrls(
    var image: String,
    var startScreen: String,
    var pokemonImage: String,
    var itemsImage: String,
    var machinesImage: String
): Parcelable
