package com.example.trendinggithubrepositories.base

import androidx.lifecycle.ViewModel

open class BaseViewModel<N> : ViewModel() {

    private var showToast = SingleLiveEvent<Int>()

    fun getShowToast(): SingleLiveEvent<Int> {
        return showToast
    }

    fun setShowToast(showToast: SingleLiveEvent<Int>) {
        this.showToast = showToast
    }

}