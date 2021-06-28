package com.example.pokedix.ui

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import com.example.pokedix.R
import com.example.pokedix.adapters.PokemonDetailsAdapter
import com.example.pokedix.models.PokedexList
import com.example.pokedix.models.PokemonDetails
import com.example.pokedix.models.PokemonDetailsResponse
import com.example.pokedix.viewmodel.PokemonDetailsViewModel
import com.google.android.material.tabs.TabLayoutMediator
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.pokemon_details_layout.*

class PokemonDescriptionDialog : DialogFragment() {
    private lateinit var pokemonDetailsAdapter: PokemonDetailsAdapter
    private lateinit var viewModel: PokemonDetailsViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pokemon_details_layout, container, false)
    }

    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.99).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.90).toInt()
        dialog?.window?.setLayout(width, height)

        viewModel = PokemonDetailsViewModel(application = Application())
        val pokemon: PokedexList? = arguments?.getParcelable(ARG_POKEMON_KEY)
        observePokemon()
        pokemon?.let {
            pokemon_name.text = it.pokemonName
            viewModel.fetchPokemon(it)
        }
    }

    private fun attachPager() {
        TabLayoutMediator(tab_layout, pager) { tab, position ->
            when (position) {
                0 -> {
                    tab.setText(R.string.description)
                }
                1 -> {
                    tab.setText(R.string.area)
                }
                2 -> {
                    tab.setText(R.string.stats)
                }
            }
        }.attach()
    }

    private fun observePokemon() {
        viewModel.pokemonLiveData.observe(this, Observer {
            type1.text = it.pokeType1.name
            type2.text = it.pokeType2.name
            pokeGenus.text = it.pokeGenera
            Picasso.get()
                .load(it.pokemonSprite.frontSprite)
                .error(R.drawable.ic_launcher_background)
                .into(pokeImage)
            initViewPager()
            pokemonDetailsAdapter.submitPokemonDetails(it)
            attachPager()
        })
    }

    private fun initViewPager() {
        pager.apply {
            pokemonDetailsAdapter = PokemonDetailsAdapter()
            adapter = pokemonDetailsAdapter
        }
    }

    companion object {
        private const val NAMESPACE = "com.example.pokedix.ui"
        private const val ARG_POKEMON_KEY = "${NAMESPACE}.pokemon"

        fun newInstance(pokemon: PokedexList): PokemonDescriptionDialog {
            val fragment = PokemonDescriptionDialog()
            val args = Bundle()
            args.putParcelable(ARG_POKEMON_KEY, pokemon)
            fragment.arguments = args
            return fragment
        }
    }
}