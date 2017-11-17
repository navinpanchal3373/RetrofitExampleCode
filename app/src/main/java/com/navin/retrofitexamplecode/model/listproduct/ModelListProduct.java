
package com.navin.retrofitexamplecode.model.listproduct;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelListProduct implements Parcelable
{

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("pager")
    @Expose
    private Pager pager;
    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("suggestion")
    @Expose
    private Object suggestion;
    public final static Creator<ModelListProduct> CREATOR = new Creator<ModelListProduct>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ModelListProduct createFromParcel(Parcel in) {
            return new ModelListProduct(in);
        }

        public ModelListProduct[] newArray(int size) {
            return (new ModelListProduct[size]);
        }

    }
    ;

    protected ModelListProduct(Parcel in) {
        this.status = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.message = ((Object) in.readValue((Object.class.getClassLoader())));
        this.pager = ((Pager) in.readValue((Pager.class.getClassLoader())));
        in.readList(this.result, (Result.class.getClassLoader()));
        this.suggestion = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public ModelListProduct() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Object getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Object suggestion) {
        this.suggestion = suggestion;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(message);
        dest.writeValue(pager);
        dest.writeList(result);
        dest.writeValue(suggestion);
    }

    public int describeContents() {
        return  0;
    }

}
