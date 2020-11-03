package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class AddressResponse {

    @SerializedName("company_address")
    @Expose
    private List<CompanyAddress> companyAddress = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<CompanyAddress> getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(List<CompanyAddress> companyAddress) {
        this.companyAddress = companyAddress;
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

    public class CompanyAddress implements Serializable {

        @SerializedName("adress_id")
        @Expose
        private String adressId;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("state_name")
        @Expose
        private String stateName;
        @SerializedName("country_name")
        @Expose
        private String countryName;
        @SerializedName("pincode")
        @Expose
        private String pincode;
        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;
        @SerializedName("adress_type")
        @Expose
        private String adressType;
        @SerializedName("country_id")
        @Expose
        private String countryId;
        @SerializedName("state_id")
        @Expose
        private String stateId;
        @SerializedName("city_id")
        @Expose
        private String cityId;
        @SerializedName("area_id")
        @Expose
        private String areaId;
        @SerializedName("area_name")
        @Expose
        private String areaName;
        @SerializedName("adress")
        @Expose
        private String adress;

        public String getAdressId() {
            return adressId;
        }

        public void setAdressId(String adressId) {
            this.adressId = adressId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getStateName() {
            return stateName;
        }

        public void setStateName(String stateName) {
            this.stateName = stateName;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
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

        public String getAdressType() {
            return adressType;
        }

        public void setAdressType(String adressType) {
            this.adressType = adressType;
        }

        public String getCountryId() {
            return countryId;
        }

        public void setCountryId(String countryId) {
            this.countryId = countryId;
        }

        public String getStateId() {
            return stateId;
        }

        public void setStateId(String stateId) {
            this.stateId = stateId;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

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
    }
}
