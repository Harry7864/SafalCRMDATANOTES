package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ViewMemberListResponse implements Serializable {
    @SerializedName("city")
    @Expose
    private List<City> city = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
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
    public class Area implements Serializable{
        @SerializedName("area_id")
        @Expose
        private String areaId;
        @SerializedName("area_name")
        @Expose
        private String areaName;
        @SerializedName("area_name_with_pincode")
        @Expose
        private String areaNameWithPincode;
        @SerializedName("pincode")
        @Expose
        private String pincode;
        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;
        @SerializedName("member")
        @Expose
        private List<Member> member = null;

        public String getAreaId() {
            return areaId;
        }

        public void setAreaId(String areaId) {
            this.areaId = areaId;
        }

        public String getAreaName() {
            return areaName;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }

        public String getAreaNameWithPincode() {
            return areaNameWithPincode;
        }

        public void setAreaNameWithPincode(String areaNameWithPincode) {
            this.areaNameWithPincode = areaNameWithPincode;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public List<Member> getMember() {
            return member;
        }

        public void setMember(List<Member> member) {
            this.member = member;
        }

    }
    public class City implements Serializable {

        @SerializedName("city_id")
        @Expose
        private String cityId;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("category_icon")
        @Expose
        private Boolean categoryIcon;
        @SerializedName("area")
        @Expose
        private List<Area> area = null;
        @SerializedName("primary_city")
        @Expose
        private Boolean primaryCity;

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public Boolean getCategoryIcon() {
            return categoryIcon;
        }

        public void setCategoryIcon(Boolean categoryIcon) {
            this.categoryIcon = categoryIcon;
        }

        public List<Area> getArea() {
            return area;
        }

        public void setArea(List<Area> area) {
            this.area = area;
        }

        public Boolean getPrimaryCity() {
            return primaryCity;
        }

        public void setPrimaryCity(Boolean primaryCity) {
            this.primaryCity = primaryCity;
        }

    }
    public class Member implements Serializable {
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
        @SerializedName("follow_status")
        @Expose
        private
        Boolean follow_status;

        public Boolean getFollow_status() {
            return follow_status;
        }

        public void setFollow_status(Boolean follow_status) {
            this.follow_status = follow_status;
        }

        @SerializedName("user_mobile")
        @Expose
        private String user_mobile;

        public String getUser_mobile() {
            return user_mobile;
        }

        public void setUser_mobile(String user_mobile) {
            this.user_mobile = user_mobile;
        }

        public String getPublic_mobile() {
            return public_mobile;
        }

        public void setPublic_mobile(String public_mobile) {
            this.public_mobile = public_mobile;
        }

        @SerializedName("public_mobile")
        @Expose
        private String public_mobile;

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

    }

}
