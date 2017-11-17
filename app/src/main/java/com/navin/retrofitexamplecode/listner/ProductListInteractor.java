package com.navin.retrofitexamplecode.listner;

import com.navin.retrofitexamplecode.model.listproduct.Result;

import java.util.List;

/**
 * Created by dell on 11/8/2017.
 */

public interface ProductListInteractor {

    void onSuccess(List<Result> results);

    void onError(String msg);
}
