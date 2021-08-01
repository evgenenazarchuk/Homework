package com.evgenynaz.myhomework.homework12


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.evgenynaz.myhomework.R
import com.evgenynaz.myhomework.databinding.ActivityHomework12Binding
import com.evgenynaz.myhomework.databinding.ActivityHomework13Binding
import com.evgenynaz.myhomework.homework10.Candy
import com.evgenynaz.myhomework.sharedpref.SharedPrefsKeys
import com.evgenynaz.myhomework.sharedpref.SharedPrefsKeys.PREFS_BRAND_KEY
import com.evgenynaz.myhomework.sharedpref.SharedPrefsKeys.PREFS_CODE_KEY
import com.evgenynaz.myhomework.sharedpref.SharedPrefsUtils

@Suppress("DEPRECATION")
class Homework12Activity : AppCompatActivity() {

    private var counter = 0
    private lateinit var binding: ActivityHomework12Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bNewFragment.setOnClickListener {
            counter++
            supportFragmentManager.beginTransaction()
                .replace(binding.contenerFragment.id, newFragment())
                .commit()

        }
    }

    private fun newFragment(): Fragment {

        when (counter) {
            1 -> return Fragment1()
            2 -> return Fragment2()
            3 -> return Fragment3()
            4 -> return Fragment4()
            5 -> {
                0.also { counter = it }
                return Fragment5()
            }
        }
        return Fragment()
    }
}






