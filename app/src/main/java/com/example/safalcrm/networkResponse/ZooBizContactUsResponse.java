package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ZooBizContactUsResponse {
    @SerializedName("fincasys_id")
    @Expose
    private String fincasysId;
    @SerializedName("fincasys_mobile")
    @Expose
    private String fincasysMobile;
    @SerializedName("fincasys_alternate_no")
    @Expose
    private String fincasysAlternateNo;
    @SerializedName("fincasys_email")
    @Expose
    private String fincasysEmail;
    @SerializedName("fincasys_website")
    @Expose
    private String fincasysWebsite;
    @SerializedName("availble_time")
    @Expose
    private String availbleTime;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public String getFincasysId() {
        return fincasysId;
    }

    public void setFincasysId(String fincasysId) {
        this.fincasysId = fincasysId;
    }

    public String getFincasysMobile() {
        return fincasysMobile;
    }

    public void setFincasysMobile(String fincasysMobile) {
        this.fincasysMobile = fincasysMobile;
    }

    public String getFincasysAlternateNo() {
        return fincasysAlternateNo;
    }

    public void setFincasysAlternateNo(String fincasysAlternateNo) {
        this.fincasysAlternateNo = fincasysAlternateNo;
    }

    public String getFincasysEmail() {
        return fincasysEmail;
    }

    public void setFincasysEmail(String fincasysEmail) {
        this.fincasysEmail = fincasysEmail;
    }

    public String getFincasysWebsite() {
        return fincasysWebsite;
    }

    public void setFincasysWebsite(String fincasysWebsite) {
        this.fincasysWebsite = fincasysWebsite;
    }

    public String getAvailbleTime() {
        return availbleTime;
    }

    public void setAvailbleTime(String availbleTime) {
        this.availbleTime = availbleTime;
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

