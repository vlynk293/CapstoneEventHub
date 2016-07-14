package com.linhv.eventhub.services;


import com.linhv.eventhub.model.request_model.ExternalLoginRequestModel;
import com.linhv.eventhub.model.request_model.LoginRequestModel;
import com.linhv.eventhub.model.request_model.RegisterRequestModel;
import com.linhv.eventhub.model.response_model.ExternalLoginResponseModel;
import com.linhv.eventhub.model.response_model.LoginResponseModel;
import com.linhv.eventhub.model.response_model.RegisterResponseModel;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by ManhNV on 6/24/2016.
 */
public interface IUserService {

    @POST("/api/account/externallogin")
    void externalLogin(@Body ExternalLoginRequestModel request, Callback<ExternalLoginResponseModel> callback);

    @POST("/api/account/login")
    void login(@Body LoginRequestModel request, Callback<LoginResponseModel> callback);


    @POST("/api/account/Register")
    void register(@Body RegisterRequestModel request, Callback<RegisterResponseModel> callback);

    @GET("/api/account/getuserinfo")
    void getUserInfo(@Query("userId") String userId,
                     Callback<LoginResponseModel> callback);
}