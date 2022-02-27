package com.example.trendinggithubrepositories

class CollapsableViewModel(
    val id: Int? = 0,
    val name: String? = "",
    val desc: String? = "",
    val url: String? = "",
    val expandableViewDetails: ArrayList<ExpandableViewModel>
)