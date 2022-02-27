package com.example.trendinggithubrepositories.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.trendinggithubrepositories.models.TrendingRepositoriesResponseItem

@Database(
    entities = [TrendingRepositoriesResponseItem::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class TrendingRepositoriesDatabase : RoomDatabase() {
    abstract fun getTrendingRepositoriesDao(): TrendingRepositoriesDao

    companion object {
        @Volatile
        private var instance: TrendingRepositoriesDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also {
                instance = it
            }
        }

        private fun createDatabase(context: Context): TrendingRepositoriesDatabase =
            Room.databaseBuilder(
                context.applicationContext,
                TrendingRepositoriesDatabase::class.java,
                "trending_repositories_db.db"
            ).build()


    }
}