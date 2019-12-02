package com.wahyu.mvvm.di.modules;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.wahyu.mvvm.di.util.ViewModelKey;
import com.wahyu.mvvm.viewmodel.ViewModelFactory;
import com.wahyu.mvvm.viewmodel.WisataViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(WisataViewModel.class)
    abstract ViewModel bindViewModel(WisataViewModel wisataViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindFactory(ViewModelFactory viewModelFactory);
}
