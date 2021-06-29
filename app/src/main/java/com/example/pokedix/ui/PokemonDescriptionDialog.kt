package com.example.pokedix.ui

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.pokedix.extensions.observe
import com.example.pokedix.R
import com.example.pokedix.adapters.PokemonDetailsAdapter
import com.example.pokedix.databinding.PokemonDetailsLayoutBinding
import com.example.pokedix.models.PokedexList
import com.example.pokedix.viewmodel.PokemonDetailsViewModel
import com.google.android.material.tabs.TabLayoutMediator
import com.squareup.picasso.Picasso

class PokemonDescriptionDialog : DialogFragment() {
    private lateinit var pokemonDetailsAdapter: PokemonDetailsAdapter
    private lateinit var viewModel: PokemonDetailsViewModel
    private lateinit var binding: PokemonDetailsLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PokemonDetailsLayoutBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root
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
            binding.pokemonName.text = it.pokemonName
            viewModel.fetchPokemon(it)
        }
    }

    private fun attachPager() {
        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
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
        viewModel.pokemonLiveData.observe(this, {
            binding.type2.text = it.pokeType1.name
            binding.type2.text = it.pokeType2.name
            binding.pokeGenus.text = it.pokeGenera
            Picasso.get()
                .load(it.pokemonSprite.frontSprite)
                .error(R.drawable.ic_launcher_background)
                .into(binding.pokeImage)
            initViewPager()
            pokemonDetailsAdapter.submitPokemonDetails(it)
            attachPager()
        }, {
        })
    }

    private fun initViewPager() {
        binding.pager.apply {
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