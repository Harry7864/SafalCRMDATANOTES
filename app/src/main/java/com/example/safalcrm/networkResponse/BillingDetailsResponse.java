package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BillingDetailsResponse implements Serializable {

    @SerializedName("employment_id")
    @Expose
    private String employmentId;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("billing_address")
    @Expose
    private String companyAddress;
    @SerializedName("company_website")
    @Expose
    private String companyWebsite;
    @SerializedName("company_contact_number")
    @Expose
    private String companyContactNumber;
    @SerializedName("gst_number")
    @Expose
    private String gstNumber;
    @SerializedName("billing_pincode")
    @Expose
    private String billingPincode;
    @SerializedName("bank_name")
    @Expose
    private String bankName;
    @SerializedName("bank_account_number")
    @Expose
    private String bankAccountNumber;
    @SerializedName("ifsc_code")
    @Expose
    private String ifscCode;
    @SerializedName("billing_contact_person")
    @Expose
    private String billingContactPerson;
    @SerializedName("billing_contact_person_name")
    @Expose
    private String billingContactPersonName;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public String getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyContactNumber() {
        return companyContactNumber;
    }

    public void setCompanyContactNumber(String companyContactNumber) {
        this.companyContactNumber = companyContactNumber;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getBillingPincode() {
        return billingPincode;
    }

    public void setBillingPincode(String billingPincode) {
        this.billingPincode = billingPincode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBillingContactPerson() {
        return billingContactPerson;
    }

    public void setBillingContactPerson(String billingContactPerson) {
        this.billingContactPerson = billingContactPerson;
    }

    public String getBillingContactPersonName() {
        return billingContactPersonName;
    }

    public void setBillingContactPersonName(String billingContactPersonName) {
        this.billingContactPersonName = billingContactPersonName;
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

}