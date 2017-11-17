package com.navin.retrofitexamplecode.controller;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.navin.retrofitexamplecode.api.LCBOnApi;
import com.navin.retrofitexamplecode.constans.Constants;
import com.navin.retrofitexamplecode.listner.ProductListInteractor;
import com.navin.retrofitexamplecode.model.listproduct.ModelListProduct;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dell on 11/8/2017.
 */

public class ProductListingControler implements Callback<ModelListProduct> {

    ProductListInteractor productListInteractor;

    public ProductListingControler(ProductListInteractor productListInteractor) {
        this.productListInteractor = productListInteractor;
    }

    public void start() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        LCBOnApi gerritAPI = retrofit.create(LCBOnApi.class);

        Call<ModelListProduct> call = gerritAPI.getProductListing();
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<ModelListProduct> call, Response<ModelListProduct> response) {
        Log.e("Data : ", "" + response);
        if (response.body().getStatus() == 200) {
            this.productListInteractor.onSuccess(response.body().getResult());
        } else {
            this.productListInteractor.onError("" + response.body().getMessage());
        }
    }

    @Override
    public void onFailure(Call<ModelListProduct> call, Throwable t) {
        Log.e("Data : ", "" + t.getMessage());
        this.productListInteractor.onError("" + t.getMessage());
    }
}
