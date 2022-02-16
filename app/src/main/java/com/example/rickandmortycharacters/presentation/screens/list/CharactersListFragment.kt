package com.example.rickandmortycharacters.presentation.screens.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.rickandmortycharacters.databinding.FragmentCharactersListBinding
import com.example.rickandmortycharacters.presentation.base.BaseFragment

/**
 * @author Evdokimov on 16.02.2022.
 */
class CharactersListFragment : BaseFragment<FragmentCharactersListBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initBinding(inflater: LayoutInflater) =
        FragmentCharactersListBinding.inflate(inflater)
}