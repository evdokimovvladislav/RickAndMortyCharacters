package com.example.rickandmortycharacters.presentation.screens.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.rickandmortycharacters.databinding.FragmentCharacterDetailsBinding
import com.example.rickandmortycharacters.presentation.base.BaseFragment

/**
 * @author Evdokimov on 16.02.2022.
 */
class CharacterDetailsFragment : BaseFragment<FragmentCharacterDetailsBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initBinding(inflater: LayoutInflater) =
        FragmentCharacterDetailsBinding.inflate(inflater)
}