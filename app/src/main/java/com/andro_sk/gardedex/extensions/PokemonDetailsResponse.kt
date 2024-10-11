package com.andro_sk.gardedex.extensions

import com.andro_sk.gardedex.models.*

fun PokemonResponse.toPokemonDetails(
    pokedexSelected: PokemonDex,
    pokemonSpecieResponse: PokemonSpecieResponse
): Pokemon {
    var type2 = PokemonType.NO
    if (types.size > 1)
        type2 = PokemonType.valueOf(types.last().type.name.toValidNameFormat())
    return Pokemon(
        id,
        name,
        PokemonType.valueOf(types.first().type.name.toValidNameFormat()),
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
        Sprites(pokedexSelected.imagesUrls.pokeFront,"")
    )
}

private fun getFlavor(gameSelected: String, flavorTextEntries: List<FlavorTextEntries>): String {
    for (flavor in flavorTextEntries) {
        if (gameSelected == flavor.version.name && flavor.language.name == "en")
            return flavor.flavorText
    }
    return ""
}