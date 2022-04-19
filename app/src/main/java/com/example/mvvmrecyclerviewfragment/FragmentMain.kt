package com.example.mvvmrecyclerviewfragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmrecyclerviewfragment.adapter.MainAdapter
import com.example.mvvmrecyclerviewfragment.databinding.FragmentMainBinding
import com.example.mvvmrecyclerviewfragment.viewModel.MainActivityViewModel

class FragmentMain : Fragment() {

    private lateinit var binding : FragmentMainBinding
    private lateinit var mainAdapter : MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.inputBookName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                initViewModel(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView() {
        binding.apply {
            rView.layoutManager = LinearLayoutManager(activity)
            val decoration = DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
            rView.addItemDecoration(decoration)
            mainAdapter = MainAdapter()
        }
    }

    private fun initViewModel(input : String) {
        val viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        viewModel.getResponse(input)
        viewModel.liveDataResponse.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                Log.i("MyTag", "Data Response : $it")
                mainAdapter.setResponseList(it)
                binding.rView.adapter = mainAdapter
            }
        })
    }

    companion object {
        fun newInstance() = FragmentMain()
    }
}