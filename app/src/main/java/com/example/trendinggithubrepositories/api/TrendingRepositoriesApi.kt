package com.example.trendinggithubrepositories.api

import com.example.trendinggithubrepositories.models.TrendingRepositoriesResponse
import retrofit2.Response
import retrofit2.http.GET

interface TrendingRepositoriesApi {

    @GET("orgs/octokit/repos")
    suspend fun getTrendingRepos(): Response<TrendingRepositoriesResponse>
}