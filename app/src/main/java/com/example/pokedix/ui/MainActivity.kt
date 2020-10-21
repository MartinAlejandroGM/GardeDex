package com.example.pokedix.ui

import android.app.ActivityOptions
import android.content.Intent
import android.content.Intent.getIntent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokedix.R
import com.example.pokedix.adapters.PokeRVAdapter
import com.example.pokedix.viewmodel.PokedixViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.game_list_layout.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: PokedixViewModel
    private lateinit var pokeAdapter: PokeRVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = PokedixViewModel(application)
        observePets()
        initRecyclerView()
        viewModel.fetchGame()
    }

    private fun initRecyclerView() {
        poke_list_recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            pokeAdapter = PokeRVAdapter()
            adapter = pokeAdapter
            pokeAdapter.onPokeDixClickListener = {
                Toast.makeText(this@MainActivity, it.name, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun observePets() {
        viewModel.pokemonLiveData.observe(this, Observer {
            pokeAdapter.submitList(it)
        })
    }
}