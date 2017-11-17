package com.navin.retrofitexamplecode.api;

import com.navin.retrofitexamplecode.constans.Constants;
import com.navin.retrofitexamplecode.model.listproduct.ModelListProduct;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dell on 11/8/2017.
 */

public interface LCBOnApi {

    @GET(Constants.METHOD_PRODLIST)
    Call<ModelListProduct> getProductListing();
}
