package com.example.pokedix.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokedexList(
    val id: Int,
    val pokemonName: String,
    val imagesUrls: PokemonImageUrls,
    val region: Regions,
    var gameVersion: String,
    var generationSelected: String,
    var gameNameGroup: String
): Parcelable

@Parcelize
data class PokemonImageUrls(
    var pokeFront: String
): Parcelable