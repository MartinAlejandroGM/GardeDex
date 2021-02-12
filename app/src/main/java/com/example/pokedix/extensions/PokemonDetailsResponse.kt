package com.example.pokedix.extensions

import com.example.pokedix.models.*

fun PokemonDetailsResponse.toPokemonDetails(
    pokedexSelected: PokedexList,
    pokemonSpecieResponse: PokemonSpecieResponse
): PokemonDetails {
    var type2 = PokemonType.NO
    if (types.size > 1)
        type2 = PokemonType.valueOf(types.last().type.name.toValidFormatTypesEnum())
    return PokemonDetails(
        id,
        name,
        PokemonType.valueOf(types.first().type.name.toValidFormatTypesEnum()),
        type2,
        getFlavor(pokedexSelected.gameVersion, pokemonSpecieResponse.flavorTextEntries),
        BaseStats(
            stats[0].baseStat,
            stats[1].baseStat,
            stats[2].baseStat,
            stats[3].baseStat,
            stats[4].baseStat,
            stats[5].baseStat
        ),
        pokemonSpecieResponse.genera[7].genus,
        PokemonSprites(pokedexSelected.imagesUrls.pokeFront,"")
    )
}

private fun getFlavor(gameSelected: String, flavorTextEntries: List<FlavorTextEntries>): String {
    for (flavor in flavorTextEntries) {
        if (gameSelected == flavor.version.name && flavor.language.name == "en")
            return flavor.flavorText
    }
    return ""
}