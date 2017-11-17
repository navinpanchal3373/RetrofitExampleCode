package com.navin.retrofitexamplecode.utilities;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by dell on 11/8/2017.
 */

public class Utilities {

    Context context;

    public Utilities(Context context) {
        this.context = context;
    }

    public void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
