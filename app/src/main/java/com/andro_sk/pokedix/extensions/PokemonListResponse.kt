package com.andro_sk.pokedix.extensions
import com.andro_sk.pokedix.models.*

fun PokedexListResponse.toPokemonList(game: GameResponse): List<PokemonDex> {
    return pokemonEntries.map { pokemon ->
        PokemonDex(
            pokemon.entryNumber,
            pokemon.pokemonSpecies.name,
            PokemonImageUrls(
                pokemon.pokemonSpecies.name.getPokemonURLSpriteByNameRegion(
                    Regions.valueOf(
                        region.name.toValidNameFormat()
                    )
                )
            ),
            Regions.valueOf(region.name.toValidNameFormat()),
            game.versions.firstOrNull()?.name.orEmpty(),
            game.generation.name,
            game.name
        )
    }
}