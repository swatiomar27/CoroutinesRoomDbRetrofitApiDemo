package com.example.trendinggithubrepositories.db

import androidx.room.TypeConverter
import com.example.trendinggithubrepositories.models.Owner

class Converters {

    @TypeConverter
    fun fromOwner(owner: Owner): String {
        return owner.avatar_url
    }

    @TypeConverter
    fun toOwner(url: String): Owner {
        return Owner(url)
    }
}