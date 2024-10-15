package com.andro_sk.gardedex.models

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
    var gameNameGroup: String = "",
    var pokeSprites: PokeSprites = PokeSprites()
): Parcelable

@Parcelize
data class PokemonImageUrls(
    var pokeFront: String = ""
): Parcelable

@Parcelize
data class PokeSprites(
    var defaultBack: String = "",
    var backFemale: String = "",
    var backShiny: String = "",
    var backShinyFemale: String = "",
    var frontDefault: String = "",
    var frontFemale: String = "",
    var frontShiny: String = "",
    var frontShinyFemale: String = ""
): Parcelable