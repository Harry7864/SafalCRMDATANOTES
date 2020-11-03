package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CategoryResponse implements Serializable
{

    @SerializedName("category")
    @Expose
    private List<Category> category = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
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


    public class Category implements Serializable
    {

        @SerializedName("business_category_id")
        @Expose
        private String businessCategoryId;
        @SerializedName("category_name")
        @Expose
        private String categoryName;
        @SerializedName("is_follow")
        @Expose
        private boolean isFollow;
        @SerializedName("category_follow_id")
        @Expose
        private String categoryFollowId;
        @SerializedName("category_icon")
        @Expose
        private String categoryIcon;

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

        public String getCategoryIcon() {
            return categoryIcon;
        }

        public void setCategoryIcon(String categoryIcon) {
            this.categoryIcon = categoryIcon;
        }

        public boolean isFollow() {
            return isFollow;
        }

        public void setFollow(boolean follow) {
            isFollow = follow;
        }

        public String getCategoryFollowId() {
            return categoryFollowId;
        }

        public void setCategoryFollowId(String categoryFollowId) {
            this.categoryFollowId = categoryFollowId;
        }
    }
}