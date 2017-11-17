
package com.navin.retrofitexamplecode.model.listproduct;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelStoreLocation {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("condtactPerson")
    @Expose
    private String condtactPerson;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCondtactPerson() {
        return condtactPerson;
    }

    public void setCondtactPerson(String condtactPerson) {
        this.condtactPerson = condtactPerson;
    }

}
