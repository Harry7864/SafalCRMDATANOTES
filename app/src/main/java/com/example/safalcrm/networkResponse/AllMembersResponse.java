package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllMembersResponse {

    @SerializedName("member")
    @Expose
    private List<AllMembers> member = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<AllMembers> getMember() {
        return member;
    }

    public void setMember(List<AllMembers> member) {
        this.member = member;
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

    public class AllMembers {

        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("business_category_id")
        @Expose
        private String businessCategoryId;
        @SerializedName("business_sub_category_id")
        @Expose
        private String businessSubCategoryId;
        @SerializedName("user_full_name")
        @Expose
        private String userFullName;
        @SerializedName("zoobiz_id")
        @Expose
        private String zoobizId;
        @SerializedName("user_profile_pic")
        @Expose
        private String userProfilePic;
        @SerializedName("bussiness_category_name")
        @Expose
        private String bussinessCategoryName;
        @SerializedName("sub_category_name")
        @Expose
        private String subCategoryName;
        @SerializedName("company_name")
        @Expose
        private String companyName;
        @SerializedName("designation")
        @Expose
        private String designation;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("area_name")
        @Expose
        private String areaName;
        @SerializedName("follow_status")
        @Expose
        private Boolean followStatus;

        @SerializedName("user_mobile")
        @Expose
        private Boolean user_mobile;

        @SerializedName("public_mobile")
        @Expose
        private Boolean public_mobile;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getBusinessCategoryId() {
            return businessCategoryId;
        }

        public void setBusinessCategoryId(String businessCategoryId) {
            this.businessCategoryId = businessCategoryId;
        }

        public String getBusinessSubCategoryId() {
            return businessSubCategoryId;
        }

        public void setBusinessSubCategoryId(String businessSubCategoryId) {
            this.businessSubCategoryId = businessSubCategoryId;
        }

        public String getUserFullName() {
            return userFullName;
        }

        public void setUserFullName(String userFullName) {
            this.userFullName = userFullName;
        }

        public String getZoobizId() {
            return zoobizId;
        }

        public void setZoobizId(String zoobizId) {
            this.zoobizId = zoobizId;
        }

        public String getUserProfilePic() {
            return userProfilePic;
        }

        public void setUserProfilePic(String userProfilePic) {
            this.userProfilePic = userProfilePic;
        }

        public String getBussinessCategoryName() {
            return bussinessCategoryName;
        }

        public void setBussinessCategoryName(String bussinessCategoryName) {
            this.bussinessCategoryName = bussinessCategoryName;
        }

        public String getSubCategoryName() {
            return subCategoryName;
        }

        public void setSubCategoryName(String subCategoryName) {
            this.subCategoryName = subCategoryName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getAreaName() {
            return areaName;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }

        public Boolean getFollowStatus() {
            return followStatus;
        }

        public void setFollowStatus(Boolean followStatus) {
            this.followStatus = followStatus;
        }

        public Boolean getUser_mobile() {
            return user_mobile;
        }

        public void setUser_mobile(Boolean user_mobile) {
            this.user_mobile = user_mobile;
        }

        public Boolean getPublic_mobile() {
            return public_mobile;
        }

        public void setPublic_mobile(Boolean public_mobile) {
            this.public_mobile = public_mobile;
        }
    }
}
