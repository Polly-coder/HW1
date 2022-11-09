package com.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw1.R
import com.model.Country

class ItemAdapter (private val dataset: List<Country>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val countryView = view.findViewById<TextView>(R.id.countryView)
        val capitalView = view.findViewById<TextView>(R.id.capitalView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(layout )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val country = dataset[position]
        holder.countryView.text = country.country_name
        holder.capitalView.text = country.capital_name
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}