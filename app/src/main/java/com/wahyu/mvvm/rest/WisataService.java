package com.wahyu.mvvm.rest;

import com.wahyu.mvvm.model.Wisata;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface WisataService {

    @GET("/?action=findAll")
    Single<Wisata> findWisata();
}
