package com.evgenynaz.myhomework.homework13

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.evgenynaz.myhomework.databinding.CandyItemBinding

import com.evgenynaz.myhomework.homework10.Brand
import com.evgenynaz.myhomework.homework10.Candy


class HomeFragment : Fragment() {
    var binding: CandyItemBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CandyItemBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val info = arguments?.getSerializable(FragmentCandy.KEY) as? Candy
        binding?.tvK?.text = info?.barcodeNumber.toString()
        binding?.tvN?.text = info?.brand.toString()

        if (binding?.tvN?.text contentEquals Brand.MARS.toString()) {
        Glide
            .with(this)
            .load("https://static.wikia.nocookie.net/edopedia/images/d/dc/%D0%9C%D0%B0%D1%80%D1%81.JPG/revision/latest?cb=20170414131137&path-prefix=ru")
            .into(binding!!.imPicther)
        }
        else if (binding?.tvN?.text contentEquals Brand.SNICKERS.toString()) {
            Glide
                .with(this)
                .load("https://snack.je/wp-content/uploads/2021/02/snickers-brownie-2pck.png")
                .into(binding!!.imPicther)
        }
        else if (binding?.tvN?.text contentEquals Brand.BOUNTY.toString()) {
            Glide
                .with(this)
                .load("https://www.barista-ltd.ru/components/com_jshopping/files/img_products/snacks-for-vending-bounty.jpg")
                .into(binding!!.imPicther)
        }
        else ("Произошла ошибка чтения данных")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        const val TAG1 = "Candy"

}
    }







