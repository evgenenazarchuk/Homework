package com.evgenynaz.myhomework.homework12


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evgenynaz.myhomework.R

class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment3_hw12, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}