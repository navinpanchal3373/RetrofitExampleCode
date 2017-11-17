package com.navin.retrofitexamplecode;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.navin.retrofitexamplecode.adapters.AdpProductList;
import com.navin.retrofitexamplecode.controller.ProductListingControler;
import com.navin.retrofitexamplecode.databinding.ActivityHomeBinding;
import com.navin.retrofitexamplecode.listner.ProductListInteractor;
import com.navin.retrofitexamplecode.model.listproduct.Result;
import com.navin.retrofitexamplecode.utilities.Utilities;

import java.util.List;

public class Home extends AppCompatActivity {

    private RecyclerView.LayoutManager layoutManager;
    Context context;
    Utilities utilities;
    AdpProductList adpProductList;
    private ActivityHomeBinding homeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_home);

        homeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        setSupportActionBar(homeBinding.toolbar);

        context = Home.this;
        utilities = new Utilities(context);

        homeBinding.list.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(context);
        homeBinding.list.setLayoutManager(layoutManager);

        homeBinding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initWidget();
    }

    public void initWidget() {

        new ProductListingControler(new ProductListInteractor() {
            @Override
            public void onSuccess(List<Result> results) {
                Log.e("Data", "" + results);
                adpProductList = new AdpProductList(context, results);
                homeBinding.list.setAdapter(adpProductList);
            }

            @Override
            public void onError(String msg) {
                utilities.showToast(msg);
            }
        }).start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
