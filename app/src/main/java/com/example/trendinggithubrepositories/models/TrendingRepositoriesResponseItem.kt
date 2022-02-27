package com.example.trendinggithubrepositories.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "trendingRepositories"
)
data class TrendingRepositoriesResponseItem(
    @PrimaryKey(autoGenerate = true)
    val gen_id: Int?= null,

    @ColumnInfo(name = "description")
    val description: String,
//    val fork: Boolean,
//    val forks: Int,
    @ColumnInfo(name = "forks_count")
    val forks_count: Int,

    @ColumnInfo(name = "full_name")
    val full_name: String,

    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "language")
    val language: String? = "Swati",

//    val name: String,
    @ColumnInfo(name = "owner")
    val owner: Owner,

    @Ignore
    val url: String,

    @ColumnInfo(name = "html_url")
    val html_url: String,
//    val watchers: Int,
    @ColumnInfo(name = "watchers_count")
    val watchers_count: Int
):Serializable