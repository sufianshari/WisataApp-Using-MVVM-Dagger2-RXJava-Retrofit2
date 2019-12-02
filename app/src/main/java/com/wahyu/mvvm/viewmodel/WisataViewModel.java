package com.wahyu.mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wahyu.mvvm.model.Wisata;
import com.wahyu.mvvm.repository.WisataRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.CompositeDisposable;

public class WisataViewModel extends ViewModel {
    WisataRepository wisataRepository;
    private CompositeDisposable disposable = new CompositeDisposable();
    private final MutableLiveData<Wisata> modelMutableLiveData = new MutableLiveData<>();

    @Inject
    public WisataViewModel(WisataRepository wisataRepository){
        this.wisataRepository = wisataRepository;
    }

    public MutableLiveData<Wisata> mutableLiveData(){
        loadData();
        return modelMutableLiveData;
    }

    public void loadData(){

    }
}
