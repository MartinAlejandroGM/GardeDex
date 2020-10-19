package com.example.pokedix.extensions

import java.util.*

fun String.nameFormat(): String{

    val replacedString: String = this.replace('-', ' ', false)

    val words = replacedString.split(" ").toMutableList()

    var output = ""

    for(word in words){
        output += word.capitalize() +" "
    }

    output = output.trim()

    return output
}