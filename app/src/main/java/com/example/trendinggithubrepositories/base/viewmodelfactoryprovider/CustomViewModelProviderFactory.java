package com.example.trendinggithubrepositories.base.viewmodelfactoryprovider;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class CustomViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory {

    private static volatile CustomViewModelProviderFactory sInstance;

    @NonNull
    public static CustomViewModelProviderFactory getInstance(@NonNull Application application) {

        if (sInstance == null) {
            synchronized (CustomViewModelProviderFactory.class) {
                if (sInstance == null) {
                    sInstance = new CustomViewModelProviderFactory(application);
                }
            }
        }
        return sInstance;
    }

    @VisibleForTesting
    public static void destroyInstance() {
        sInstance = null;
    }

    private CustomViewModelProviderFactory(Application application) {
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
//        if (modelClass.isAssignableFrom(AddTimersFragmentVM.class)) {
//            noinspection unchecked
//            return (T) new AddTimersFragmentVM(mSmartTaskManager);
//        }

        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }

}
