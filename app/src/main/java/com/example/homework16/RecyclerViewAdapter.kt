package com.example.homework16

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide

class RecyclerViewAdapter(val items: MutableList<Hero>, val onClick: (String) -> Unit) :
    Adapter<RecycleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        val listItemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_layout, parent, false)
        return RecycleViewHolder(listItemView)
    }

    override fun getItemCount(): Int = items.count()

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        holder.name.text = items[position].name
        Glide.with(holder.itemView.context)
            .load(items[position].images.lg)
            .into(holder.image)
        "Name: ${items[position].biography.fullName}".also { holder.fullName.text = it }
        "Birth place: ${items[position].biography.placeOfBirth}".also {
            holder.placeOfBirth.text = it
        }
        "Aliases: ${items[position].biography.aliases}".also { holder.aliases.text = it }
        "Publisher: ${items[position].biography.publisher}".also { holder.publisher.text = it }
        "Gender: ${items[position].appearance.gender}".also { holder.gender.text = it }
        "Race: ${items[position].appearance.race}".also { holder.race.text = it }
        "Height: ${items[position].appearance.height[1]}".also { holder.height.text = it }
        "Weight: ${items[position].appearance.weight[1]}".also { holder.weight.text = it }
        "Intelligence: ${items[position].powerstats.intelligence}".also {
            holder.intelligence.text = it
        }
        "Strength: ${items[position].powerstats.strength}".also { holder.strength.text = it }
        "Speed: ${items[position].powerstats.speed}".also { holder.speed.text = it }
        "Durability: ${items[position].powerstats.durability}".also { holder.durability.text = it }
        "Power: ${items[position].powerstats.power}".also { holder.power.text = it }
        "Combat: ${items[position].powerstats.combat}".also { holder.combat.text = it }
        holder.itemView.setOnClickListener {
            onClick(items[position].name)
        }
    }
}

class RecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name: TextView = itemView.findViewById(R.id.heroName)
    val image: ImageView = itemView.findViewById(R.id.photo)
    val fullName: TextView = itemView.findViewById(R.id.fullName)
    val placeOfBirth: TextView = itemView.findViewById(R.id.placeOfBirth)
    val aliases: TextView = itemView.findViewById(R.id.aliases)
    val publisher: TextView = itemView.findViewById(R.id.publisher)
    val gender: TextView = itemView.findViewById(R.id.gender)
    val race: TextView = itemView.findViewById(R.id.race)
    val height: TextView = itemView.findViewById(R.id.height)
    val weight: TextView = itemView.findViewById(R.id.weight)
    val intelligence: TextView = itemView.findViewById(R.id.intelligence)
    val strength: TextView = itemView.findViewById(R.id.strength)
    val speed: TextView = itemView.findViewById(R.id.speed)
    val durability: TextView = itemView.findViewById(R.id.durability)
    val power: TextView = itemView.findViewById(R.id.power)
    val combat: TextView = itemView.findViewById(R.id.combat)
}