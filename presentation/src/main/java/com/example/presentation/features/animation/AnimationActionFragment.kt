package com.example.presentation.features.animation

import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentAnimationActionBinding
import com.example.presentation.features.MainActivity


class AnimationActionFragment :
    BaseFragment<FragmentAnimationActionBinding>(R.layout.fragment_animation_action) {

    override fun configureToolbar() = MainActivity.ToolbarConfiguration(
        showToolbar = true,
        toolbarTitle = getString(R.string.animation_screen)
    )

    override fun setUpUi() {

    }

}