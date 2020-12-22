package com.example.pokedix.ui

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import com.example.pokedix.R
import com.example.pokedix.models.PokedexList
import com.example.pokedix.viewmodel.PokedexViewModel
import com.example.pokedix.viewmodel.PokemonDetailsViewModel
import kotlinx.android.synthetic.main.pokemon_details_layout.*

class PokemonDescriptionDialog: DialogFragment() {
    private lateinit var viewModel: PokemonDetailsViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //dialog!!.window?.setBackgroundDrawableResource(R.drawable.poke_back);
        return inflater.inflate(R.layout.pokemon_details_layout, container, false)
    }

    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)

        viewModel = PokemonDetailsViewModel(Application())
        val pokemon: PokedexList? = arguments?.getParcelable("pokemon")
        observeGames()

        pokemon?.let {
            pokemon_name.text = it.name
            viewModel.fetchPokemon(it.name)
        }
    }

    private fun observeGames() {
        viewModel.pokemonLiveData.observe(this, Observer {
            description.text = it.pokeDescription
        })
    }

    companion object{
        private const val ARG_POKEMON_KEY = "pokemon"

        fun newInstance(pokemon: PokedexList):PokemonDescriptionDialog {
            val fragment = PokemonDescriptionDialog()
            val args = Bundle()
            args.putParcelable( ARG_POKEMON_KEY,pokemon)
            fragment.arguments = args
            return fragment
        }
    }
}