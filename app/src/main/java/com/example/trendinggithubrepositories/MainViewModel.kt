package com.example.trendinggithubrepositories

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.androiddevs.mvvmnewsapp.util.Resource
import com.example.trendinggithubrepositories.base.BaseViewModel
import com.example.trendinggithubrepositories.base.SingleLiveEvent
import com.example.trendinggithubrepositories.models.TrendingRepositoriesResponse
import kotlinx.coroutines.launch
import retrofit2.Response
import java.io.IOException

class MainViewModel(val application: Application, private val repository: TrendingRepository) :
    BaseViewModel<Unit>() {

    private var trendingReposResponse: TrendingRepositoriesResponse? = null
    val breakingNews: SingleLiveEvent<Resource<TrendingRepositoriesResponse>> = SingleLiveEvent()

//    init {
//        getTrendingRepositories()
//    }

    fun getTrendingRepositories() = viewModelScope.launch {
        safeTrendingRepositoriesCall()
    }

    private suspend fun safeTrendingRepositoriesCall(apiCall: Boolean = true) {
        breakingNews.postValue(Resource.Loading())
        try {
            val response: Response<TrendingRepositoriesResponse> =
                repository.getTrendingGithubRepos()
            breakingNews.postValue(handleTrendingReposResponse(response))
        } catch (t: Throwable) {
            when (t) {
                is IOException -> breakingNews.postValue(Resource.Error("Network Failure"))
                else -> breakingNews.postValue(Resource.Error("Conversion Error"))
            }
        }
    }

    private fun handleFakeTrendingReposResponse(response: TrendingRepositoriesResponse): Resource<TrendingRepositoriesResponse> {
        if (trendingReposResponse == null) {
            trendingReposResponse = response
        }
        return Resource.Success(trendingReposResponse ?: response)
    }

    private fun handleTrendingReposResponse(response: Response<TrendingRepositoriesResponse>): Resource<TrendingRepositoriesResponse> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                if (trendingReposResponse == null) {
                    trendingReposResponse = resultResponse
                }
                return Resource.Success(trendingReposResponse ?: resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

    fun getRepoData(trendingRepositoriesResponse: TrendingRepositoriesResponse): ArrayList<CollapsableViewModel> {

        val finalArrayList: ArrayList<CollapsableViewModel> = ArrayList()

        viewModelScope.launch {

            for ((index, _) in trendingRepositoriesResponse.withIndex()) {
                val responseItem = trendingRepositoriesResponse[index]

                repository.deleteData()
                repository.insertTrendingRepos(responseItem)

                val expandableViewDetails: ArrayList<ExpandableViewModel> = ArrayList()
                val expandableViewModel = ExpandableViewModel(
                    responseItem.id,
                    responseItem.html_url,
                    responseItem.language,
                    responseItem.watchers_count,
                    responseItem.forks_count
                )
                expandableViewDetails.add(expandableViewModel)

                val collapsableViewModel = CollapsableViewModel(
                    responseItem.id,
                    responseItem.full_name,
                    responseItem.description,
                    responseItem.owner.avatar_url,
                    expandableViewDetails
                )
                finalArrayList.add(collapsableViewModel)
            }

        }
        return finalArrayList
    }

    fun apiHit() {
        viewModelScope.launch {
            safeTrendingRepositoriesCall()
        }
    }

    fun sortByName() {
        trendingReposResponse?.let { trendingRepositoriesResponse ->
            trendingRepositoriesResponse.sortBy { trendingRepositoriesResponseItem ->
                trendingRepositoriesResponseItem.full_name
            }
            breakingNews.postValue(Resource.Success(trendingRepositoriesResponse))
        }
    }

    fun sortByStars() {
        trendingReposResponse?.let { trendingRepositoriesResponse ->
            trendingRepositoriesResponse.sortBy { trendingRepositoriesResponseItem ->
                trendingRepositoriesResponseItem.watchers_count
            }
            breakingNews.postValue(Resource.Success(trendingRepositoriesResponse))
        }
    }

    fun getDataFromDb() {
        viewModelScope.launch {
            val allRepos = repository.getAllRepos()
            if (allRepos==null && allRepos.isEmpty()){
                getTrendingRepositories()
            }else{
                breakingNews.postValue(Resource.Success(allRepos))
            }
        }

    }
}