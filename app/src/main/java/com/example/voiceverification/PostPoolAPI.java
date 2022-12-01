package com.example.voiceverification;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface PostPoolAPI {

    String BASE_URL = "https://sandbox.toloka.dev/";

    @Headers({
            "Authorization: y0_AgAAAABl2_-yAACtpQAAAADTN0zX7-gJHe7bRDmXPwmVX-Z6Pw-y12E",
            "Content-Type: application/JSON"
    })
    @POST("api/v1/pools")
    Call<List<PoolResults>> sendPool(@Body JsonObject poolDetails);

}
