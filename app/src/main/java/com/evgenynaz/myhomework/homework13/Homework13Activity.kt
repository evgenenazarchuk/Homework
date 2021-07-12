package com.evgenynaz.myhomework.homework13


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.evgenynaz.myhomework.databinding.ActivityHomework13Binding
import com.evgenynaz.myhomework.homework10.Candy
import com.evgenynaz.myhomework.homework10.candyView


class Homework13Activity : AppCompatActivity() {
    private lateinit var binding: ActivityHomework13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(binding.content.id, FragmentBarcode(), FragmentBarcode.TAG)
            .commit()
    }


    fun clickListener(candy: Candy) {
        val toast = Toast.makeText(
            this, "${candy.barcodeNumber}, ${candy.brand}", Toast.LENGTH_SHORT)
        toast.show()

        val fragmentCandy = CandyFragment().apply {
            arguments = bundleOf(FragmentBarcode.KEY to candyView())
        }

        supportFragmentManager.beginTransaction()
            .replace(binding.heder.id, fragmentCandy, CandyFragment.TAG1)
            .addToBackStack(null)
            .commit()
    }
}






