package com.example.trendinggithubrepositories

import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.androiddevs.mvvmnewsapp.preferences.IPreferenceHelper
import com.androiddevs.mvvmnewsapp.preferences.PreferenceManager
import com.androiddevs.mvvmnewsapp.util.Constants.Companion.FIVE_MINUTES
import com.example.trendinggithubrepositories.base.BaseActivity
import com.example.trendinggithubrepositories.databinding.ActivityMainBinding
import com.example.trendinggithubrepositories.db.TrendingRepositoriesDatabase
import com.example.trendinggithubrepositories.util.showToast

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun layoutRes(): Int = R.layout.activity_main

    override fun getBaseViewModel(): MainViewModel {
        val newsRepository = TrendingRepository(TrendingRepositoriesDatabase(this))
        val viewModelProviderFactory =
            TrendingRepositoriesViewModelProviderFactory(application, newsRepository)
        return ViewModelProvider(this, viewModelProviderFactory)[MainViewModel::class.java]
    }

    override fun getBindingVariable(): Int = BR.viewModel

    override fun onLoadData() {
        super.onLoadData()

        setSupportActionBar(binding.includeToolbar.toolbar)

        binding.includeToolbar.icOptionsMenu.setOnClickListener {
            applicationContext.showToast("Click on options menu")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_trending, menu)
        return true
    }

    override fun onPause() {
        super.onPause()
        Log.e("-->>","On Pause")
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.sort_by_stars -> {
                getBaseViewModel().sortByStars()
            }
            R.id.sort_by_name -> {
                getBaseViewModel().sortByName()
            }
        }
        return true
    }
}