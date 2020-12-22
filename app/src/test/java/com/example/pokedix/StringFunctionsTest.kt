package com.example.pokedix

import com.example.pokedix.extensions.toFormatURL
import org.junit.Assert
import org.junit.Test

class StringFunctionsTest {
    @Test
    fun testFormatUrlPokedexs(){
        Assert.assertEquals("v2/pokedex/1/", "https://pokeapi.co/api/v2/pokedex/1/".toFormatURL())
    }
}