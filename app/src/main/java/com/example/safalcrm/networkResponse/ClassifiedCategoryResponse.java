package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ClassifiedCategoryResponse implements Serializable {

    @SerializedName("classifiedCategories")
    @Expose
    private List<ClassifiedCategory> classifiedCategories = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<ClassifiedCategory> getClassifiedCategories() {
        return classifiedCategories;
    }

    public void setClassifiedCategories(List<ClassifiedCategory> classifiedCategories) {
        this.classifiedCategories = classifiedCategories;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class ClassifiedCategory implements Serializable {

        @SerializedName("calssified_main_cat_entries")
        @Expose
        private String calssifiedMainCatEntries;
        @SerializedName("business_category_id")
        @Expose
        private String businessCategoryId;
        @SerializedName("category_name")
        @Expose
        private String categoryName;

        public String getCalssifiedMainCatEntries() {
            return calssifiedMainCatEntries;
        }

        public void setCalssifiedMainCatEntries(String calssifiedMainCatEntries) {
            this.calssifiedMainCatEntries = calssifiedMainCatEntries;
        }

        public String getBusinessCategoryId() {
            return businessCategoryId;
        }

        public void setBusinessCategoryId(String businessCategoryId) {
            this.businessCategoryId = businessCategoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

    }

}
