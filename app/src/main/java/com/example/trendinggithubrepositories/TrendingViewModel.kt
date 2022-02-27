package com.example.trendinggithubrepositories

import com.example.trendinggithubrepositories.base.BaseViewModel

class TrendingViewModel : BaseViewModel<Unit>() {

    fun getData(): HashMap<String, List<String>> {
        val expandableListDetail = HashMap<String, List<String>>()
        val cricket: MutableList<String> = ArrayList()
        cricket.add("India")
        val football: MutableList<String> = ArrayList()
        football.add("Brazil")
        val basketball: MutableList<String> = ArrayList()
        basketball.add("United States")
        expandableListDetail["CRICKET TEAMS"] = cricket
        expandableListDetail["FOOTBALL TEAMS"] = football
        expandableListDetail["BASKETBALL TEAMS"] = basketball
        return expandableListDetail
    }
}