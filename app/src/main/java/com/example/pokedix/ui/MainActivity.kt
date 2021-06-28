package com.example.pokedix.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokedix.R
import com.example.pokedix.adapters.GameAdapter
import com.example.pokedix.viewmodel.GamesListViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: GamesListViewModel
    private lateinit var pokeAdapter: GameAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = GamesListViewModel(application)
        observeGames()
        initRecyclerView()
        viewModel.fetchGame()

        main_activity_toolbar.setTitle(R.string.app_name)
        setSupportActionBar(main_activity_toolbar)
    }

    private fun initRecyclerView() {
        poke_list_recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            pokeAdapter = GameAdapter()
            adapter = pokeAdapter
            pokeAdapter.onPokeDixClickListener = {
                val gameIntent = OptionsGSActivity.getIntent(this@MainActivity, it)
                startActivity(gameIntent)
                Toast.makeText(this@MainActivity, it.game.name, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun observeGames() {
        viewModel.gameLiveData.observe(this, Observer {
            pokeAdapter.submitList(it)
        })
    }
}