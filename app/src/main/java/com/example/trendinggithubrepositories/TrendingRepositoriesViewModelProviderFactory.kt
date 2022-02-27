package com.example.trendinggithubrepositories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TrendingRepositoriesViewModelProviderFactory(val application: Application, val repository: TrendingRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(application, repository) as T
    }
}