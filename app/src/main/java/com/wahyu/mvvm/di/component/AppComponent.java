package com.wahyu.mvvm.di.component;

import com.wahyu.mvvm.di.modules.ContextModule;
import com.wahyu.mvvm.di.modules.NetworkModule;
import com.wahyu.mvvm.ui.wisata.WisataActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {ContextModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(WisataActivity wisataActivity);
}
