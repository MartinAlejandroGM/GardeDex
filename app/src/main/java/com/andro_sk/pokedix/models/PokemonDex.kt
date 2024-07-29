package com.andro_sk.pokedix.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class PokemonDex(
    val id: Int = 0,
    val pokemonName: String = "",
    val imagesUrls: PokemonImageUrls = PokemonImageUrls(),
    val region: Regions = Regions.ALOLA,
    var gameVersion: String = "",
    var generationSelected: String = "",
    var gameNameGroup: String = ""
): Parcelable

@Parcelize
data class PokemonImageUrls(
    var pokeFront: String = ""
): Parcelable