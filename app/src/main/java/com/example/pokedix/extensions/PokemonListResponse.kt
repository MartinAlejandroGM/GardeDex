package com.example.pokedix.extensions
import com.example.pokedix.models.*

fun PokedexListResponse.toPokemonList(game: GameResponse): List<PokedexList> {
    return pokemonEntries.map { pokemon ->
        PokedexList(
            pokemon.entryNumber,
            pokemon.pokemonSpecies.name,
            PokemonImageUrls(
                pokemon.pokemonSpecies.name.getPokemonURLSpriteByNameRegion(
                    Regions.valueOf(
                        region.name.toValidFormatTypesEnum()
                    )
                )
            ),
            Regions.valueOf(region.name.toValidFormatTypesEnum()),
            game.versions[0].name,
            game.generation.name,
            game.name
        )
    }
}