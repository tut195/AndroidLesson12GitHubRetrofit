package com.babenkovladimir.retrofit;

import com.babenkovladimir.model.Repository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IGithub {

    @GET("/users/{username}/repos")
    public Call<List<Repository>> getUsersRepo(@Path("username") String username);



}
