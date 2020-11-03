package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class SubCategoryResponse implements Serializable {

    @SerializedName("sub_category")
    @Expose
    private List<SubCategory> subCategory = null;
    @SerializedName("slider")
    @Expose
    private List<BannerResponse.Slider> slider = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<SubCategory> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<SubCategory> subCategory) {
        this.subCategory = subCategory;
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

    public List<BannerResponse.Slider> getSlider() {
        return slider;
    }

    public void setSlider(List<BannerResponse.Slider> slider) {
        this.slider = slider;
    }

    public class SubCategory implements Serializable {

        private final static long serialVersionUID = 4143513366291507222L;
        @SerializedName("business_sub_category_id")
        @Expose
        private String businessSubCategoryId;
        @SerializedName("business_category_id")
        @Expose
        private String businessCategoryId;
        @SerializedName("category_name")
        @Expose
        private String categoryName;
        @SerializedName("sub_category_name")
        @Expose
        private String subCategoryName;
        @SerializedName("sub_category_icon")
        @Expose
        private String subCategoryIcon;
        @SerializedName("sub_category_images")
        @Expose
        private String subCategoryImages;

        public String getBusinessSubCategoryId() {
            return businessSubCategoryId;
        }

        public void setBusinessSubCategoryId(String businessSubCategoryId) {
            this.businessSubCategoryId = businessSubCategoryId;
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

        public String getSubCategoryName() {
            return subCategoryName;
        }

        public void setSubCategoryName(String subCategoryName) {
            this.subCategoryName = subCategoryName;
        }

        public String getSubCategoryIcon() {
            return subCategoryIcon;
        }

        public void setSubCategoryIcon(String subCategoryIcon) {
            this.subCategoryIcon = subCategoryIcon;
        }

        public String getSubCategoryImages() {
            return subCategoryImages;
        }

        public void setSubCategoryImages(String subCategoryImages) {
            this.subCategoryImages = subCategoryImages;
        }

    }
}
