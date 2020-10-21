package com.example.pokedix.extensions

import java.util.*

fun String.nameFormat(): String{

    val replacedString: String = this.replace('-', ' ', false)

    val words = replacedString.split(" ").toMutableList()

    var output = StringBuilder()

    for(word in words){
        output.append(word.capitalize(Locale.ROOT).plus(" "))
    }

    return output.toString()
}