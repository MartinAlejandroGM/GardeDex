package com.example.pokedix.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedix.R
import com.example.pokedix.databinding.PokeListLayoutBinding
import com.example.pokedix.models.PokedexList
import com.squareup.picasso.Picasso

class PokedexAdapter : RecyclerView.Adapter<PokedexAdapter.PokedexViewHolder>() {
    private var pokeList = ArrayList<PokedexList>()
    var onListClickListener: ((PokedexList) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokedexViewHolder {
        return PokedexViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.poke_list_layout, parent, false)
        )
    }

    fun submitList(pokemonList: List<PokedexList>, shouldClear: Boolean = false) {
        if (shouldClear) {
            pokeList.clear()
        }
        pokeList.addAll(pokemonList)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: PokedexViewHolder, position: Int) {
        holder.pokemonListBind(pokeList[position])
    }

    override fun getItemCount() = pokeList.size

    inner class PokedexViewHolder constructor(v: View) : RecyclerView.ViewHolder(v){
        private val binding = PokeListLayoutBinding.bind(v)
        fun pokemonListBind(pokemon: PokedexList) = with(binding) {
            Picasso.get()
                .load("https://iili.io/KISExa.png")
                .error(R.drawable.ic_launcher_background)
                .into(binding.pokemonImg)
            Picasso.get()
                .load(pokemon.imagesUrls.pokeFront)
                .error(R.drawable.ic_launcher_background)
                .into(binding.pokeSprite)
            binding.root.setOnClickListener {
                onListClickListener?.invoke(pokemon)
            }
        }
    }
}