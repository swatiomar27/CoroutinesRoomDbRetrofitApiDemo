package com.example.trendinggithubrepositories

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.trendinggithubrepositories.base.BaseFragment
import com.example.trendinggithubrepositories.databinding.FragmentErrorBinding

class ErrorFragment : BaseFragment<FragmentErrorBinding, ErrorViewModel>() {

    override fun getBindingVariable(): Int = BR.viewModel

    override fun getLayoutId(): Int = R.layout.fragment_error

    override fun getViewModel(): ErrorViewModel =
        ViewModelProvider(this).get(ErrorViewModel::class.java)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = getViewDataBinding() ?: return

        binding.btnTryWithoutRemote.setOnClickListener {
            findNavController().popBackStack(R.id.trendingFragment, true)
        }
    }
}