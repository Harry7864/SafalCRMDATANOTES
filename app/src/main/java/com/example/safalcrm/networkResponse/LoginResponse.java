package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoginResponse implements Serializable
{
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("zoobiz_id")
    @Expose
    private String zoobizId;
    @SerializedName("plan_renewal_date")
    @Expose
    private String planRenewalDate;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("instagram")
    @Expose
    private String instagram;
    @SerializedName("linkedin")
    @Expose
    private String linkedin;
    @SerializedName("twitter")
    @Expose
    private String twitter;
        @SerializedName("user_full_name")
    @Expose
    private String userFullName;
    @SerializedName("user_first_name")
    @Expose
    private String userFirstName;
    @SerializedName("user_last_name")
    @Expose
    private String userLastName;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("member_date_of_birth_new")
    @Expose
    private String memberDateOfBirth;
    @SerializedName("user_mobile")
    @Expose
    private String userMobile;
    @SerializedName("alt_mobile")
    @Expose
    private String altMobile;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("whatsapp_number")
    @Expose
    private String whatsappNumber;
    @SerializedName("email_privacy")
    @Expose
    private String emailPrivacy;
    @SerializedName("user_profile_pic")
    @Expose
    private String userProfilePic;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("company_logo")
    @Expose
    private String companyLogo;
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
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("area_name")
    @Expose
    private String areaName;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("salutation")
    @Expose
    private String salutation;
    @SerializedName("public_mobile")
    @Expose
    private String publicMobile;
    @SerializedName("whatsapp_privacy")
    @Expose
    private String whatsAppPrivacy;
    @SerializedName("cllassified_mute")
    @Expose
    private String cllassifiedMute;
    @SerializedName("invoice_download")
    @Expose
    private boolean invoiceDownload;
    @SerializedName("invoice_url")
    @Expose
    private String invoiceUrl;

    @SerializedName("total_post")
    @Expose
    private String totalPost;
    @SerializedName("followers")
    @Expose
    private String followers;
    @SerializedName("following")
    @Expose
    private String following;


    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getZoobizId() {
        return zoobizId;
    }

    public void setZoobizId(String zoobizId) {
        this.zoobizId = zoobizId;
    }

    public String getPlanRenewalDate() {
        return planRenewalDate;
    }

    public void setPlanRenewalDate(String planRenewalDate) {
        this.planRenewalDate = planRenewalDate;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMemberDateOfBirth() {
        return memberDateOfBirth;
    }

    public void setMemberDateOfBirth(String memberDateOfBirth) {
        this.memberDateOfBirth = memberDateOfBirth;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getAltMobile() {
        return altMobile;
    }

    public void setAltMobile(String altMobile) {
        this.altMobile = altMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
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

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getPublicMobile() {
        return publicMobile;
    }

    public void setPublicMobile(String publicMobile) {
        this.publicMobile = publicMobile;
    }

    public String getWhatsAppPrivacy() {
        return whatsAppPrivacy;
    }

    public void setWhatsAppPrivacy(String whatsAppPrivacy) {
        this.whatsAppPrivacy = whatsAppPrivacy;
    }

    public String getCllassifiedMute() {
        return cllassifiedMute;
    }

    public void setCllassifiedMute(String cllassifiedMute) {
        this.cllassifiedMute = cllassifiedMute;
    }

    public String getTotalPost() {
        return totalPost;
    }

    public void setTotalPost(String totalPost) {
        this.totalPost = totalPost;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public boolean isInvoiceDownload() {
        return invoiceDownload;
    }

    public void setInvoiceDownload(boolean invoiceDownload) {
        this.invoiceDownload = invoiceDownload;
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    public String getEmailPrivacy() {
        return emailPrivacy;
    }

    public void setEmailPrivacy(String emailPrivacy) {
        this.emailPrivacy = emailPrivacy;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }
}