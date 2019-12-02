package com.wahyu.mvvm.repository;

import com.wahyu.mvvm.model.Wisata;
import com.wahyu.mvvm.rest.WisataService;

import javax.inject.Inject;

import io.reactivex.Single;

public class WisataRepository {
    private WisataService wisataService;

    @Inject
    public WisataRepository(WisataService wisataService) {
        this.wisataService = wisataService;
    }

    public Single<Wisata> wisataSingle(){
        return wisataService.findWisata();
    }

}
