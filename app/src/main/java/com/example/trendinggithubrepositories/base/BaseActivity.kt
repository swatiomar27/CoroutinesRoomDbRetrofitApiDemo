package com.example.trendinggithubrepositories.base

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.trendinggithubrepositories.R

abstract class BaseActivity<VB : ViewDataBinding, T : BaseViewModel<Unit>> : AppCompatActivity() {

    private lateinit var progressDialog: ProgressDialog
    private lateinit var mProgress: ProgressDialog
    protected open var savedInstanceState: Bundle? = null
    private var _binding: VB? = null
    val binding get() = _binding!!

    private var _viewModel: T? = null

    @LayoutRes
    protected abstract fun layoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.savedInstanceState = savedInstanceState
        _binding = DataBindingUtil.setContentView(this, layoutRes())

        _viewModel = getBaseViewModel()
        _binding?.setVariable(getBindingVariable(), _viewModel)
        _binding?.lifecycleOwner = this
        _binding?.executePendingBindings()
        _binding?.let {
            setProgressbar(it.root.context)
        }
        onLoadData()
    }

    private fun setProgressbar(context: Context) {
        progressDialog = ProgressDialog(context)
        with(progressDialog) {
            this.setMessage(getString(R.string.please_wait))
            this.setCancelable(false)
            this.isIndeterminate = true
        }
    }

    abstract fun getBaseViewModel(): T?

    abstract fun getBindingVariable(): Int

    protected open fun onLoadData() {}

    internal fun showProgressBar() {
        progressDialog.show()
    }

    internal fun hideProgressBar() {
        progressDialog.dismiss()
    }
}