package com.example.hw3.ui

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.hw3.R
import com.example.hw3.base.BaseFragment
import com.example.hw3.databinding.FragmentPersonBinding

class PersonFragments : BaseFragment<FragmentPersonBinding>(R.layout.fragment_person) {

    override val binding by viewBinding(FragmentPersonBinding::bind)

    override fun initialize() {
        super.initialize()
    }

    override fun setupClickListeners() {
        super.setupClickListeners()
    }

    override fun setupRequests() {
        super.setupRequests()
    }

    override fun setupObservers() {
        super.setupObservers()
    }
}