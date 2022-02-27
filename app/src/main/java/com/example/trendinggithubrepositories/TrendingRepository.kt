package com.example.trendinggithubrepositories

import com.example.trendinggithubrepositories.api.RetrofitInstance
import com.example.trendinggithubrepositories.db.TrendingRepositoriesDatabase
import com.example.trendinggithubrepositories.models.TrendingRepositoriesResponseItem

class TrendingRepository(val db: TrendingRepositoriesDatabase) {
    suspend fun getTrendingGithubRepos() =
        RetrofitInstance.api.getTrendingRepos()


    suspend fun getAllRepos() = db.getTrendingRepositoriesDao().getAllTrendingRepositories()

    suspend fun insertTrendingRepos(trendingRepositoriesResponseItem: TrendingRepositoriesResponseItem) =
        db.getTrendingRepositoriesDao().insertAllOrders(trendingRepositoriesResponseItem)

    suspend fun deleteData() = db.getTrendingRepositoriesDao().deleteTableData()
}