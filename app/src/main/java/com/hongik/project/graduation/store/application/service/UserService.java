package com.hongik.project.graduation.store.application.service;

import com.hongik.project.graduation.store.ui.network.request.UserLoginRequest;
import com.hongik.project.graduation.store.ui.network.request.UserSignUpRequest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserService {
    @FormUrlEncoded
    @POST("auth/signin/")
    Call<UserLoginRequest> userLogin(
            @Field("Username") String id,
            @Field("Password") String password
    );

    @FormUrlEncoded
    @POST("auth/signup/")
    Call<UserSignUpRequest> userSignUp(
            @Field("Username") String id,
            @Field("Password") String password,
            @Field("Name") String name,
            @Field("Email") String email,
            @Field("Gender") String gender,
            @Field("Age") int age
    );
}
