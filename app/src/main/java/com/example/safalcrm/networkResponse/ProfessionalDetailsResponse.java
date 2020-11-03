package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class ProfessionalDetailsResponse implements Serializable {

    @SerializedName("employment_id")
    @Expose
    private String employmentId;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("user_full_name")
    @Expose
    private String userFullName;
    @SerializedName("user_phone")
    @Expose
    private String userPhone;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("employment_type")
    @Expose
    private String employmentType;
    @SerializedName("category_name")
    @Expose
    private String categoryName;
    @SerializedName("sub_category_name")
    @Expose
    private String subCategoryName;
    @SerializedName("business_categories_other")
    @Expose
    private String businessCategoriesOther;
    @SerializedName("professional_other")
    @Expose
    private String professionalOther;
    @SerializedName("employment_description")
    @Expose
    private String employmentDescription;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("designation")
    @Expose
    private String designation;

    @SerializedName("company_website")
    @Expose
    private String companyWebsite;
    @SerializedName("search_keyword")
    @Expose
    private String searchKeyword;
    @SerializedName("company_contact_number")
    @Expose
    private String companyContactNumber;
    @SerializedName("company_email")
    @Expose
    private String companyEmail;
    @SerializedName("products_servicess")
    @Expose
    private String productsServicess;
    @SerializedName("company_logo")
    @Expose
    private String companyLogo;
    @SerializedName("company_logo_name")
    @Expose
    private String companyLogoName;
    @SerializedName("company_broucher")
    @Expose
    private String companyBroucher;
    @SerializedName("company_broucher_name")
    @Expose
    private String companyBroucherName;
    @SerializedName("company_profile")
    @Expose
    private String companyProfile;
    @SerializedName("compny_profile_name")
    @Expose
    private String compnyProfileName;
    @SerializedName("business_category_id")
    @Expose
    private String businessCategoryId;
    @SerializedName("business_sub_category_id")
    @Expose
    private String businessSubCategoryId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;


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

    public String getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
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

    public String getBusinessCategoriesOther() {
        return businessCategoriesOther;
    }

    public void setBusinessCategoriesOther(String businessCategoriesOther) {
        this.businessCategoriesOther = businessCategoriesOther;
    }

    public String getProfessionalOther() {
        return professionalOther;
    }

    public void setProfessionalOther(String professionalOther) {
        this.professionalOther = professionalOther;
    }

    public String getEmploymentDescription() {
        return employmentDescription;
    }

    public void setEmploymentDescription(String employmentDescription) {
        this.employmentDescription = employmentDescription;
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

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public String getCompanyContactNumber() {
        return companyContactNumber;
    }

    public void setCompanyContactNumber(String companyContactNumber) {
        this.companyContactNumber = companyContactNumber;
    }

    public String getProductsServicess() {
        return productsServicess;
    }

    public void setProductsServicess(String productsServicess) {
        this.productsServicess = productsServicess;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyLogoName() {
        return companyLogoName;
    }

    public void setCompanyLogoName(String companyLogoName) {
        this.companyLogoName = companyLogoName;
    }

    public String getCompanyBroucher() {
        return companyBroucher;
    }

    public void setCompanyBroucher(String companyBroucher) {
        this.companyBroucher = companyBroucher;
    }

    public String getCompanyBroucherName() {
        return companyBroucherName;
    }

    public void setCompanyBroucherName(String companyBroucherName) {
        this.companyBroucherName = companyBroucherName;
    }

    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    public String getCompnyProfileName() {
        return compnyProfileName;
    }

    public void setCompnyProfileName(String compnyProfileName) {
        this.compnyProfileName = compnyProfileName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
}
