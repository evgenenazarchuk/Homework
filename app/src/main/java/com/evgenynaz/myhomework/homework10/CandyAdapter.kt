package com.evgenynaz.myhomework.homework10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.evgenynaz.myhomework.R

class CandyAdapter(private val CandyList: MutableList<Candy>
) : RecyclerView.Adapter<CandyAdapter.CandyViewHolder>() {

    override fun getItemCount(): Int = CandyList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.clause_candy, parent, false)
        return CandyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CandyViewHolder, position: Int) {
        holder.bind(CandyList.get(position))
    }

    class CandyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val brand: TextView = itemView.findViewById(R.id.brand)
        private val barcodeNumber: TextView = itemView.findViewById(R.id.barcodeNumber)

        fun bind(item: Candy) {
            brand.text = item.brand
            barcodeNumber.text = item.barcodeNumber.toString()
        }
    }
}