package com.navin.retrofitexamplecode.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.navin.retrofitexamplecode.R;
import com.navin.retrofitexamplecode.model.listproduct.Result;

import java.util.List;

/**
 * Created by dell on 11/8/2017.
 */

public class AdpProductList extends RecyclerView.Adapter<AdpProductList.ViewHolder> {

    Context context;
    List<Result> results;

    public AdpProductList(Context context, List<Result> results) {
        this.context = context;
        this.results = results;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.raw_product, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Result result = results.get(position);
        holder.txtName.setText(result.getName());
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;

        public ViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
        }
    }
}
