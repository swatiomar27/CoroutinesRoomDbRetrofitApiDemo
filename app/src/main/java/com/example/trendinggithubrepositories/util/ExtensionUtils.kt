package com.example.trendinggithubrepositories.util

import android.content.Context
import android.view.View
import android.widget.Toast


/**
 * This method is used to show or hide a View
 */
fun Context.showToast(msg: String) {
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}
