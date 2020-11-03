package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CllassifiedSubCategoriesResponse implements Serializable {
    @SerializedName("classifiedSubCategories")
    @Expose
    private List<ClassifiedSubCategory> classifiedSubCategories = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<ClassifiedSubCategory> getClassifiedSubCategories() {
        return classifiedSubCategories;
    }

    public void setClassifiedSubCategories(List<ClassifiedSubCategory> classifiedSubCategories) {
        this.classifiedSubCategories = classifiedSubCategories;
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

    public class ClassifiedSubCategory implements Serializable {

        @SerializedName("calssified_sub_cat_entries")
        @Expose
        private String calssifiedSubCatEntries;
        @SerializedName("business_category_id")
        @Expose
        private String businessCategoryId;
        @SerializedName("business_sub_category_id")
        @Expose
        private String businessSubCategoryId;
        @SerializedName("sub_category_name")
        @Expose
        private String subCategoryName;

        public String getCalssifiedSubCatEntries() {
            return calssifiedSubCatEntries;
        }

        public void setCalssifiedSubCatEntries(String calssifiedSubCatEntries) {
            this.calssifiedSubCatEntries = calssifiedSubCatEntries;
        }

        public String getBusinessSubCategoryId() {
            return businessSubCategoryId;
        }

        public void setBusinessSubCategoryId(String businessSubCategoryId) {
            this.businessSubCategoryId = businessSubCategoryId;
        }

        public String getSubCategoryName() {
            return subCategoryName;
        }

        public void setSubCategoryName(String subCategoryName) {
            this.subCategoryName = subCategoryName;
        }

        public String getBusinessCategoryId() {
            return businessCategoryId;
        }

        public void setBusinessCategoryId(String businessCategoryId) {
            this.businessCategoryId = businessCategoryId;
        }
    }
}
