
package com.navin.retrofitexamplecode.model.listproduct;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pager implements Parcelable
{

    @SerializedName("records_per_page")
    @Expose
    private Integer recordsPerPage;
    @SerializedName("total_record_count")
    @Expose
    private Integer totalRecordCount;
    @SerializedName("current_page_record_count")
    @Expose
    private Integer currentPageRecordCount;
    @SerializedName("is_first_page")
    @Expose
    private Boolean isFirstPage;
    @SerializedName("is_final_page")
    @Expose
    private Boolean isFinalPage;
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("current_page_path")
    @Expose
    private String currentPagePath;
    @SerializedName("next_page")
    @Expose
    private Integer nextPage;
    @SerializedName("next_page_path")
    @Expose
    private String nextPagePath;
    @SerializedName("previous_page")
    @Expose
    private Object previousPage;
    @SerializedName("previous_page_path")
    @Expose
    private Object previousPagePath;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_pages_path")
    @Expose
    private String totalPagesPath;
    public final static Creator<Pager> CREATOR = new Creator<Pager>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pager createFromParcel(Parcel in) {
            return new Pager(in);
        }

        public Pager[] newArray(int size) {
            return (new Pager[size]);
        }

    }
    ;

    protected Pager(Parcel in) {
        this.recordsPerPage = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalRecordCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.currentPageRecordCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isFirstPage = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isFinalPage = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.currentPage = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.currentPagePath = ((String) in.readValue((String.class.getClassLoader())));
        this.nextPage = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nextPagePath = ((String) in.readValue((String.class.getClassLoader())));
        this.previousPage = ((Object) in.readValue((Object.class.getClassLoader())));
        this.previousPagePath = ((Object) in.readValue((Object.class.getClassLoader())));
        this.totalPages = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalPagesPath = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Pager() {
    }

    public Integer getRecordsPerPage() {
        return recordsPerPage;
    }

    public void setRecordsPerPage(Integer recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
    }

    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getCurrentPageRecordCount() {
        return currentPageRecordCount;
    }

    public void setCurrentPageRecordCount(Integer currentPageRecordCount) {
        this.currentPageRecordCount = currentPageRecordCount;
    }

    public Boolean getIsFirstPage() {
        return isFirstPage;
    }

    public void setIsFirstPage(Boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    public Boolean getIsFinalPage() {
        return isFinalPage;
    }

    public void setIsFinalPage(Boolean isFinalPage) {
        this.isFinalPage = isFinalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getCurrentPagePath() {
        return currentPagePath;
    }

    public void setCurrentPagePath(String currentPagePath) {
        this.currentPagePath = currentPagePath;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public String getNextPagePath() {
        return nextPagePath;
    }

    public void setNextPagePath(String nextPagePath) {
        this.nextPagePath = nextPagePath;
    }

    public Object getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(Object previousPage) {
        this.previousPage = previousPage;
    }

    public Object getPreviousPagePath() {
        return previousPagePath;
    }

    public void setPreviousPagePath(Object previousPagePath) {
        this.previousPagePath = previousPagePath;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public String getTotalPagesPath() {
        return totalPagesPath;
    }

    public void setTotalPagesPath(String totalPagesPath) {
        this.totalPagesPath = totalPagesPath;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(recordsPerPage);
        dest.writeValue(totalRecordCount);
        dest.writeValue(currentPageRecordCount);
        dest.writeValue(isFirstPage);
        dest.writeValue(isFinalPage);
        dest.writeValue(currentPage);
        dest.writeValue(currentPagePath);
        dest.writeValue(nextPage);
        dest.writeValue(nextPagePath);
        dest.writeValue(previousPage);
        dest.writeValue(previousPagePath);
        dest.writeValue(totalPages);
        dest.writeValue(totalPagesPath);
    }

    public int describeContents() {
        return  0;
    }

}
