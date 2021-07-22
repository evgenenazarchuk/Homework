package com.evgenynaz.myhomework.homework17

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evgenynaz.myhomework.databinding.CurrencyBinding
import com.evgenynaz.myhomework.homework17.data.Currency


class CurrencyAdapter(
    private val currencyList: MutableList<Currency> = mutableListOf()

) : RecyclerView.Adapter<CurrencyAdapter.CurrentyViewHolder>() {


    override fun getItemCount(): Int {
        return currencyList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrentyViewHolder =
        CurrentyViewHolder(CurrencyBinding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(holder: CurrentyViewHolder, position: Int) {
        holder.bind(currencyList[position])
    }

    fun update(newcyrrencyList: MutableList<Currency>) {
        currencyList.clear()
        currencyList.addAll(newcyrrencyList)
        notifyDataSetChanged()
    }

    class CurrentyViewHolder(
        private val bindingView: CurrencyBinding
    ) : RecyclerView.ViewHolder(bindingView.root) {

        fun bind(item: Currency) {
            bindingView.id.text = item.id.toString()
            bindingView.name.text = item.name
            bindingView.sign.text = item.sign

        }
    }
}