package com.evgenynaz.myhomework.homework13

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evgenynaz.myhomework.databinding.FragmentCandyBinding
import com.evgenynaz.myhomework.homework10.Candy


class CandyAdapter(
    private val sweetList: MutableList<Candy>,
    private val clickListener: (Candy) -> Unit
) : RecyclerView.Adapter<CandyAdapter.Candy2ViewHolder>() {

    override fun getItemCount(): Int = sweetList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Candy2ViewHolder {

        return Candy2ViewHolder(
            FragmentCandyBinding.inflate(LayoutInflater.from(parent.context)),
            clickListener
        )
    }

    override fun onBindViewHolder(holder: Candy2ViewHolder, position: Int) {
        holder.bind(sweetList[position])
    }

    fun update(newSweetList: MutableList<Candy>) {

        sweetList.clear()
        sweetList.addAll(newSweetList)
        notifyDataSetChanged()
    }

    class Candy2ViewHolder(
        private val bindingView: FragmentCandyBinding,
        private val clickListener: (Candy) -> Unit
    ) :
        RecyclerView.ViewHolder(bindingView.root) {

        fun bind(item: Candy) {
            bindingView.tvMarka2.text = item.brand.toString()
            bindingView.tvKod2.text = item.barcodeNumber.toString()

            itemView.setOnClickListener { clickListener(item) }
        }
    }
}