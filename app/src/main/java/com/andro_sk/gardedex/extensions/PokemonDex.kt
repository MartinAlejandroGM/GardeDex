package com.andro_sk.gardedex.extensions

import com.andro_sk.gardedex.models.PokeSprites
import com.andro_sk.gardedex.models.PokemonDex
import com.andro_sk.gardedex.utils.StringConstants

fun PokemonDex.getPokemonSpritesById(): PokeSprites {
    return PokeSprites(
        defaultBack = StringConstants.POKEMON_SPRITE_DEFAULT_BACK.plus("${this.id}.png"),
        backFemale =  StringConstants.POKEMON_SPRITE_FEMALE_BACK.plus("${this.id}.png"),
        backShiny = StringConstants.POKEMON_SPRITE_SHINY_BACK.plus("${this.id}.png"),
        backShinyFemale = StringConstants.POKEMON_SPRITE_SHINY_FEMALE_BACK.plus("${this.id}.png"),
        frontDefault = StringConstants.POKEMON_SPRITE_FRONT_DEFAULT.plus("${this.id}.png"),
        frontFemale = StringConstants.POKEMON_SPRITE_FEMALE_FRONT.plus("${this.id}.png"),
        frontShiny = StringConstants.POKEMON_SPRITE_SHINY_FRONT.plus("${this.id}.png"),
        frontShinyFemale = StringConstants.POKEMON_SPRITE_SHINY_FEMALE_FRONT.plus("${this.id}.png")
    )
}