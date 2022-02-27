package com.example.trendinggithubrepositories.models

import androidx.room.ColumnInfo

data class Owner(
    @ColumnInfo(name = "avatar_url")
    val avatar_url: String
   )