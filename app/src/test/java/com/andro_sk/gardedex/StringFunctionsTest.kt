package com.andro_sk.gardedex

import com.andro_sk.gardedex.extensions.toFormatURL
import org.junit.Assert
import org.junit.Test

class StringFunctionsTest {
    @Test
    fun testFormatUrlPokedexs(){
        val expected = "v2/pokedex/1/"
        val actual = "https://pokeapi.co/api/v2/pokedex/1/".toFormatURL()
        Assert.assertEquals(expected, actual)
    }
}