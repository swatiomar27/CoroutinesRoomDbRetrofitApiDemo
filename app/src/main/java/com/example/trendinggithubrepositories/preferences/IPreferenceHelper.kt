package com.androiddevs.mvvmnewsapp.preferences

interface IPreferenceHelper {

    fun setApiKey(apiKey: String)
    fun getApiKey(): String
    fun setUserId(userId: String)
    fun getUserId(): String
    fun clearPrefs()
    fun setLaunchTime(currentTimeMillis: Long)
    fun getLaunchTime(): Long
}
