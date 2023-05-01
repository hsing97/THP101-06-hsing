package com.example.test

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.test.databinding.FragmentTest2Binding

class TestFragment : Fragment() {

    private lateinit var binding: FragmentTest2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val viewModel: TestViewModel2 by viewModels()
        binding = FragmentTest2Binding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            // arguments即為前頁傳來的bundle，如果不為null即可取值
            arguments?.let {
                viewModel?.user?.value = it.getSerializable("user") as User?
            }
        }
    }
}