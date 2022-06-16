package com.hongik.project.graduation.store.ui.network.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.ToString;

@ToString
public class UserLoginRequest {
    @SerializedName("Username")
    @Expose
    private String id;

    @SerializedName("Password")
    @Expose
    private String password;

    @SerializedName("token")
    private String token;
}
