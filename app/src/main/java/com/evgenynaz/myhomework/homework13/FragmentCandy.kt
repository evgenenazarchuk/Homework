package com.evgenynaz.myhomework.homework13

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.evgenynaz.myhomework.databinding.FragmentBarcodeCandyBinding
import com.evgenynaz.myhomework.homework10.Candy
import java.util.Observer

class FragmentCandy : Fragment() {
    private var binding: FragmentBarcodeCandyBinding? = null
    private val myViewModel: FragmentCandyCode by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBarcodeCandyBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listCandy: MutableList<Candy> = mutableListOf()
        val candyAdapter = CandyAdapter(listCandy) { clickListener(it) }

        binding!!.rvSweet2?.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding!!.rvSweet2?.adapter = candyAdapter

        myViewModel.candyLiveData2.observe(this.viewLifecycleOwner, Observer())
    }


    private fun Observer() {

    }

    private fun clickListener(candy: Candy) {

        (activity as? Homework13Activity)?.clickListener(candy)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        const val TAG = "CandyBarcode"
        const val KEY = "Key"
    }
}

private fun Any.observe(viewLifecycleOwner: LifecycleOwner, observer: Unit) {

}


