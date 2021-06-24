package com.evgenynaz.myhomework.homework10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.evgenynaz.myhomework.databinding.ClauseCandyBinding
import com.evgenynaz.myhomework.homework10.Brand.*


class CandyAdapter(
    private val candyList: MutableList<Candy>
) : RecyclerView.Adapter<CandyAdapter.CandyViewHolder>() {

    override fun getItemCount(): Int = candyList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandyViewHolder =
        CandyViewHolder(
            ClauseCandyBinding.inflate(LayoutInflater.from(parent.context))
        )


    override fun onBindViewHolder(holder: CandyViewHolder, position: Int) {
        holder.bind(candyList.get(position))
    }

    fun update(newCandy: MutableList<Candy>) {
        candyList.clear()
        candyList.addAll(newCandy)
        notifyDataSetChanged()
    }

    class CandyViewHolder(private val bindingView: ClauseCandyBinding) :
        RecyclerView.ViewHolder(bindingView.root) {

        //private val brand: TextView = itemView.findViewById(R.id.brand)
        // private val barcodeNumber: TextView = itemView.findViewById(R.id.barcodeNumber)

        fun bind(item: Candy) {
            bindingView.brand.text = item.brand.toString()
            bindingView.barcodeNumber.text = item.barcodeNumber.toString()
            if (bindingView.brand.text ==MARS.toString()) {
                      Glide
                          .with(itemView.context)
                          .load("https://static.wikia.nocookie.net/edopedia/images/d/dc/%D0%9C%D0%B0%D1%80%D1%81.JPG/revision/latest?cb=20170414131137&path-prefix=ru")
                          .into(bindingView.imageCandy)
                  }
                  else if (bindingView.brand.text ==SNICKERS.toString()) {
                      Glide
                          .with(itemView.context)
                          .load("https://snack.je/wp-content/uploads/2021/02/snickers-brownie-2pck.png")
                          .into(bindingView.imageCandy)
                  }
                  else if (bindingView.brand.text ==BOUNTY.toString()) {
                      Glide
                          .with(itemView.context)
                          .load("https://www.barista-ltd.ru/components/com_jshopping/files/img_products/snacks-for-vending-bounty.jpg")
                          .into(bindingView.imageCandy)
                  }
            else ("Произошла ошибка чтения данных")
        }
    }
}
















