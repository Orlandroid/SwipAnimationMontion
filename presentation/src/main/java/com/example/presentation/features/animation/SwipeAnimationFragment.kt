package com.example.presentation.features.animation

import androidx.navigation.fragment.findNavController
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentSwipeAnimationBinding
import com.example.presentation.extensions.setOnMyTransitionListener


class SwipeAnimationFragment :
    BaseFragment<FragmentSwipeAnimationBinding>(R.layout.fragment_swipe_animation) {


    override fun setUpUi() {
        binding.montionUp.setOnMyTransitionListener(
            onComplete = { onMyTransitionComplete() })
        binding.montionDown.setOnMyTransitionListener(
            onComplete = { onMyTransitionComplete() })
    }


    private fun onMyTransitionComplete() {
        findNavController().navigate(SwipeAnimationFragmentDirections.actionSwipeAnimationFragmentToAnimationActionFragment())
    }


}