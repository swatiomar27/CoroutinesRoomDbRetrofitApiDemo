package com.example.trendinggithubrepositories.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.trendinggithubrepositories.models.TrendingRepositoriesResponse
import com.example.trendinggithubrepositories.models.TrendingRepositoriesResponseItem


@Dao
interface TrendingRepositoriesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllOrders(trendingRepositoriesResponseItem: TrendingRepositoriesResponseItem)

    @Query("SELECT * FROM trendingRepositories")
    suspend fun getAllTrendingRepositories(): ArrayList<TrendingRepositoriesResponseItem>

    @Query("DELETE FROM trendingRepositories")
    suspend fun deleteTableData()
}