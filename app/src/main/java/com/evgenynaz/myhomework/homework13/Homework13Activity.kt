package com.evgenynaz.myhomework.homework13


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.evgenynaz.myhomework.R
import com.evgenynaz.myhomework.databinding.ActivityHomework13Binding
import com.evgenynaz.myhomework.homework10.Candy
import com.evgenynaz.myhomework.sharedpref.SharedPrefsKeys
import com.evgenynaz.myhomework.sharedpref.SharedPrefsKeys.PREFS_BRAND_KEY
import com.evgenynaz.myhomework.sharedpref.SharedPrefsKeys.PREFS_CODE_KEY
import com.evgenynaz.myhomework.sharedpref.SharedPrefsUtils

@Suppress("DEPRECATION")
class Homework13Activity : AppCompatActivity() {
    private lateinit var binding: ActivityHomework13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        SharedPrefsUtils.sharedPrefs =
            applicationContext.getSharedPreferences(SharedPrefsKeys.PREFS_KEY, MODE_PRIVATE)
        supportFragmentManager.beginTransaction()

            .replace(binding.content.id, FragmentBarcode(), FragmentBarcode.TAG)
            .commit()


        val toastBrand = SharedPrefsUtils.sharedPrefs.getString(
            PREFS_BRAND_KEY, resources.getString(
                R.string.no_value
            )
        )
        val toastCode = SharedPrefsUtils.sharedPrefs.getString(
            PREFS_CODE_KEY, resources.getString(
                R.string.no_value
            )
        )

        val toast = Toast.makeText(
            this,
            "$toastBrand, $toastCode",
            Toast.LENGTH_SHORT
        )
        toast.show()
    }

    fun clickListener(candy: Candy) {

        //   val toast = Toast.makeText(
        //this, "${candy.barcodeNumber}, ${candy.brand}", Toast.LENGTH_SHORT)
        //  toast.show()

        SharedPrefsUtils.putString(PREFS_BRAND_KEY, candy.barcodeNumber.toString())
        SharedPrefsUtils.putString(PREFS_CODE_KEY, candy.brand.toString())

        val fragmentCandy = CandyFragment().apply {
            arguments = bundleOf(FragmentBarcode.KEY to candy)
        }


        supportFragmentManager.beginTransaction()
            .replace(binding.heder.id, fragmentCandy, CandyFragment.TAG1)
            .addToBackStack(null)
            .commit()
    }
}






