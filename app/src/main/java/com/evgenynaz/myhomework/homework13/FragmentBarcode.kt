package com.evgenynaz.myhomework.homework13

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.evgenynaz.myhomework.databinding.MainFragmentsBinding
import com.evgenynaz.myhomework.homework10.Candy


class FragmentBarcode : Fragment() {

    private var binding: MainFragmentsBinding? = null
    private val mainViewModel: FragmentViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragmentsBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listCandy: MutableList<Candy> = mutableListOf()
        val sweetAdapter = CandyAdapter(listCandy) { clickListener(it) }

        binding!!.rvSweet2?.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding!!.rvSweet2?.adapter = sweetAdapter

        mainViewModel.candyLiveData2.observe(this.viewLifecycleOwner, Observer {
            sweetAdapter.update(it)
        })
    }

    private fun clickListener(sweet: Candy) {

        (activity as? Homework13Activity)?.clickListener(sweet)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        const val TAG = "FragmentBarcode"
        const val KEY = "Key"
    }
}