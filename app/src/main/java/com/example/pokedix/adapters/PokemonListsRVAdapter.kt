package com.example.pokedix.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedix.R
import com.example.pokedix.extensions.nameFormat
import com.example.pokedix.models.GamesList
import com.example.pokedix.models.PokemonList
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.game_list_layout.view.*
import kotlinx.android.synthetic.main.poke_list_layout.view.*

class PokemonListsRVAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var pokeList = ArrayList<PokemonList>()
    var onListClickListener: ((PokemonList) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PokemonListsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.poke_list_layout, parent, false)
        )
    }

    fun submitList(pokemonList: List<PokemonList>, shouldClear: Boolean = false) {
        if (shouldClear) {
            pokeList.clear()
        }
        pokeList.addAll(pokemonList)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PokemonListsRVAdapter.PokemonListsViewHolder -> {
                holder.pokemonListBind(pokeList[position])
            }
        }
    }

    override fun getItemCount() = pokeList.size

    inner class PokemonListsViewHolder constructor(v: View) : RecyclerView.ViewHolder(v){
        fun pokemonListBind(pokemon: PokemonList) = itemView.run {
            pokemon_name.text = pokemon.name
            //TODO: Picasso image of pokemon.
            setOnClickListener {
                onListClickListener?.invoke(pokemon)
            }
        }
    }
}