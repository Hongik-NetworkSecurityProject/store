package com.hongik.project.graduation.store.ui.network.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserSignUpRequest {
    @SerializedName("Username")
    @Expose
    private String id;

    @SerializedName("Password")
    @Expose
    private String password;

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("Email")
    @Expose
    private String email;

    @SerializedName("Gender")
    @Expose
    private String gender;

    @SerializedName("Age")
    @Expose
    private int age;
}
