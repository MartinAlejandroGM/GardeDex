package com.example.pokedix.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedix.R
import com.example.pokedix.extensions.nameFormat
import com.example.pokedix.extensions.setImageGenerationsPicasso
import com.example.pokedix.models.GamesList
import com.example.pokedix.models.Results
import com.example.pokedix.viewmodel.GamesListViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.game_list_layout.view.*
import kotlinx.android.synthetic.main.poke_list_layout.view.*

class GameRVAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var gamesList = ArrayList<GamesList>()
    var onPokeDixClickListener: ((GamesList) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return GenerationsViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.game_list_layout, parent, false)
            )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GenerationsViewHolder -> {
                holder.generationsBind(gamesList[position])
            }
        }
    }

    fun submitList(gameList: List<GamesList>, shouldClear: Boolean = false) {
        if (shouldClear) {
            gamesList.clear()
        }
        gamesList.addAll(gameList)
        notifyDataSetChanged()
    }

    override fun getItemCount() = gamesList.size


    inner class GenerationsViewHolder constructor(v: View) : RecyclerView.ViewHolder(v){
        fun generationsBind(game: GamesList) = itemView.run {
            game_text.text = game.game.name.nameFormat()
            Picasso.get()
                .load(game.gameListUrls.gameImage)
                .error(R.drawable.ic_launcher_background)
                .into(button_game)
            setOnClickListener {
                onPokeDixClickListener?.invoke(game)
            }
        }
    }
}