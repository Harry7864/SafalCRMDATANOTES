package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommonResponse {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("category_follow_id")
    @Expose
    private String categoryFollowId;

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

    public String getCategoryFollowId() {
        return categoryFollowId;
    }

    public void setCategoryFollowId(String categoryFollowId) {
        this.categoryFollowId = categoryFollowId;
    }
}
