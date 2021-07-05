package com.evgenynaz.myhomework.homework13

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evgenynaz.myhomework.databinding.ItemFragmentSweetBinding
import com.evgenynaz.myhomework.homework10.Candy

class CandyAdapter (
    private val candyList: MutableList<Candy>,
    private val clickListener: (Candy) -> Unit
) : RecyclerView.Adapter<CandyAdapter.Candy2ViewHolder>() {

    override fun getItemCount(): Int = candyList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Candy2ViewHolder {

        return Candy2ViewHolder(
            ItemFragmentSweetBinding.inflate(LayoutInflater.from(parent.context)),
            clickListener
        )
    }

    override fun onBindViewHolder(holder: Candy2ViewHolder, position: Int) {
        holder.bind(candyList[position])
    }

    fun update(newSweetList: MutableList<Candy>) {

        candyList.clear()
        candyList.addAll(newSweetList)
        notifyDataSetChanged()
    }

    class Candy2ViewHolder(
        private val bindingView: ItemFragmentSweetBinding,
        private val clickListener: (Candy) -> Unit
    ) :
        RecyclerView.ViewHolder(bindingView.root) {

        fun bind(item: Candy) {
            bindingView.barcodeNumber2.text = item.barcodeNumber.toString()
            bindingView.brand2.text = item.brand.toString()


            itemView.setOnClickListener { clickListener(item) }
        }
    }
}