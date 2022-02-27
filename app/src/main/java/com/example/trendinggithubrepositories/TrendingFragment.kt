package com.example.trendinggithubrepositories

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.androiddevs.mvvmnewsapp.preferences.IPreferenceHelper
import com.androiddevs.mvvmnewsapp.preferences.PreferenceManager
import com.androiddevs.mvvmnewsapp.util.Constants
import com.androiddevs.mvvmnewsapp.util.Resource
import com.example.trendinggithubrepositories.base.BaseFragment
import com.example.trendinggithubrepositories.databinding.FragmentTrendingBinding
import com.example.trendinggithubrepositories.db.TrendingRepositoriesDatabase
import com.example.trendinggithubrepositories.models.TrendingRepositoriesResponse

class TrendingFragment : BaseFragment<FragmentTrendingBinding, MainViewModel>() {
    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(activity?.applicationContext!!) }
    private var previousGroup = -1

    override fun getBindingVariable(): Int = BR.viewModel

    override fun getLayoutId(): Int = R.layout.fragment_trending

    override fun getViewModel(): MainViewModel {
        val newsRepository =
            TrendingRepository(TrendingRepositoriesDatabase(mActivity?.applicationContext!!))
        val viewModelProviderFactory =
            TrendingRepositoriesViewModelProviderFactory(mActivity?.application!!, newsRepository)
        return ViewModelProvider(this, viewModelProviderFactory)[MainViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = getViewDataBinding() ?: return

        val fiveMinsAgo: Long = System.currentTimeMillis() - Constants.FIVE_MINUTES
        val launchTime = preferenceHelper.getLaunchTime()

        if (launchTime < fiveMinsAgo) {
            Log.e("-->>", "5 mins completed api hit")
            preferenceHelper.setLaunchTime(System.currentTimeMillis())
            getViewModel().getTrendingRepositories()
        }else{
            Log.e("-->>", "5 mins not completed")
            getViewModel().getDataFromDb()
        }

        binding.swipeToRefresh.setOnRefreshListener {
            getViewModel().getTrendingRepositories()
        }


        getViewModel().breakingNews.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    binding.swipeToRefresh.isRefreshing = false
                    hideProgressBar()
                    response.data?.let { trendingRepositoriesResponse ->
                        setExpandableAdapter(trendingRepositoriesResponse, binding)

                    }
                }
                is Resource.Error -> {
                    binding.swipeToRefresh.isRefreshing = false
                    hideProgressBar()
                    findNavController().navigate(R.id.action_trendingFragment_to_errorFragment)
                }
                is Resource.Loading -> {
                    showProgressBar()
                }
            }
        }

    }

    private fun setExpandableAdapter(
        trendingRepositoriesResponse: TrendingRepositoriesResponse,
        binding: FragmentTrendingBinding
    ) {
        val repoData = getViewModel().getRepoData(trendingRepositoriesResponse)

        val expandableListAdapter =
            CustomExpandableListAdapter(repoData)
        binding.expandableListView.setAdapter(expandableListAdapter)


        binding.expandableListView.setOnGroupExpandListener { groupPosition ->
            if ((previousGroup != -1) && (groupPosition != previousGroup)) {
                binding.expandableListView.collapseGroup(previousGroup)
            }
            previousGroup = groupPosition

        }

        binding.expandableListView.setOnGroupCollapseListener { groupPosition ->
            if (groupPosition == -1) return@setOnGroupCollapseListener
        }

    }

}