package com.example.pokedix.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokedexList(
    val id: Int,
    val name: String,
    val imagesUrls: PokemonImageUrls
): Parcelable

@Parcelize
data class PokemonImageUrls(
    var pokeFront: String,
    var pokeBack: String
): Parcelable