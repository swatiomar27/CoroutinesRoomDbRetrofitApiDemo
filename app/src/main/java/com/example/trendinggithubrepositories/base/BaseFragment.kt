package com.example.trendinggithubrepositories.base

import android.app.Application
import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.trendinggithubrepositories.MainActivity
import com.example.trendinggithubrepositories.R

abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel<Unit>> : Fragment() {

    private lateinit var progressDialog: ProgressDialog
    protected var mActivity: MainActivity? = null
    protected var mApplication: Application? = null
    private var mViewDataBinding: T? = null
    private var mViewModel: V? = null

    /**
     * Override for set binding variable
     *
     * @return variable id
     */
    abstract fun getBindingVariable(): Int

    /**
     * @return layout resource id
     */
    @LayoutRes
    abstract fun getLayoutId(): Int

    /**
     * Override for set view model
     *
     * @return view model instance
     */
    abstract fun getViewModel(): V?

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainActivity) {
            mActivity = context
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mApplication = mActivity?.application
        mViewModel = getViewModel()
        setHasOptionsMenu(false)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mViewDataBinding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        return mViewDataBinding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewDataBinding?.setVariable(getBindingVariable(), mViewModel)
        mViewDataBinding?.setLifecycleOwner(this)
        setProgressbar(view.context)
        mViewDataBinding?.executePendingBindings()
    }

    private fun setProgressbar(context: Context) {
        progressDialog = ProgressDialog(context)
        with(progressDialog) {
            this.setMessage(getString(com.example.trendinggithubrepositories.R.string.please_wait))
            this.setCancelable(false)
            this.isIndeterminate = true
        }
    }

    internal fun showProgressBar() {
        progressDialog.show()
    }

    internal fun hideProgressBar() {
        progressDialog.dismiss()
    }

    override fun onDetach() {
        mActivity = null
        super.onDetach()
    }

    protected fun getViewDataBinding(): T? {
        return mViewDataBinding
    }
}