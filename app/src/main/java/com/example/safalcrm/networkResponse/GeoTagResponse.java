package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GeoTagResponse implements Serializable {
    @SerializedName("NearByMember")
    @Expose
    private List<NearByMember> nearByMember = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<NearByMember> getNearByMember() {
        return nearByMember;
    }

    public void setNearByMember(List<NearByMember> nearByMember) {
        this.nearByMember = nearByMember;
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

    public class NearByMember {

        @SerializedName("user_id")
        @Expose
        private String userId;

        @SerializedName("adress")
        @Expose
        private String adress;

        @SerializedName("user_mobile")
        @Expose
        private String user_mobile;

        @SerializedName("user_email")
        @Expose
        private String user_email;

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public String getUser_mobile() {
            return user_mobile;
        }

        public void setUser_mobile(String user_mobile) {
            this.user_mobile = user_mobile;
        }

        public String getUser_email() {
            return user_email;
        }

        public void setUser_email(String user_email) {
            this.user_email = user_email;
        }

        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("business_category_id")
        @Expose
        private String businessCategoryId;
        @SerializedName("business_sub_category_id")
        @Expose
        private String businessSubCategoryId;
        @SerializedName("user_full_name")
        @Expose
        private String userFullName;
        @SerializedName("add_latitude")
        @Expose
        private String addLatitude;
        @SerializedName("add_longitude")
        @Expose
        private String addLongitude;
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
        @SerializedName("distance_in_km")
        @Expose
        private String distanceInKm;

        @SerializedName("menu_icon")
        @Expose
        private String menu_icon;


        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
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

        public String getAddLatitude() {
            return addLatitude;
        }

        public void setAddLatitude(String addLatitude) {
            this.addLatitude = addLatitude;
        }

        public String getAddLongitude() {
            return addLongitude;
        }

        public void setAddLongitude(String addLongitude) {
            this.addLongitude = addLongitude;
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

        public String getDistanceInKm() {
            return distanceInKm;
        }

        public void setDistanceInKm(String distanceInKm) {
            this.distanceInKm = distanceInKm;
        }

        public String getMenu_icon() {
            return menu_icon;
        }

        public void setMenu_icon(String menu_icon) {
            this.menu_icon = menu_icon;
        }
    }
}
