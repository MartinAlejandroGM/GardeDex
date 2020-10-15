package com.example.pokedix.ui

import android.app.ActivityOptions
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pokedix.R
import com.example.pokedix.adapters.PokeRVAdapter
import com.example.pokedix.viewmodel.PokemonViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: PokemonViewModel
    private lateinit var pokeAdapter: PokeRVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = PokemonViewModel(application)
        observePets()
        initRecyclerView()
        viewModel.fetchPokemon()
    }

    private fun initRecyclerView() {
        poke_list_recycler.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            pokeAdapter = PokeRVAdapter()
            adapter = pokeAdapter
        }
    }

    private fun observePets() {
        viewModel.pokemonLiveData.observe(this, Observer {
            pokeAdapter.submitList(it)
        })
    }
}