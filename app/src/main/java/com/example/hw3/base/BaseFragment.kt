package com.example.hw3.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding>(
    @LayoutRes layoutId: Int
) : Fragment(layoutId) {

    protected abstract val binding: Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
        initialize()
        setupRequests()
        setupObservers()
    }

    protected open fun setupClickListeners() {

    }

    protected open fun initialize() {

    }

    protected open fun setupRequests() {

    }

    protected open fun setupObservers() {

    }
}