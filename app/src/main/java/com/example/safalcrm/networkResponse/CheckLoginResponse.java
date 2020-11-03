package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckLoginResponse {

    @SerializedName("unread_notification")
    @Expose
    private String unread_notification;
    @SerializedName("unread_timeline_notification")
    @Expose
    private String unread_timeline_notification;
    @SerializedName("unread_chat")
    @Expose
    private String unread_chat;
    @SerializedName("advertisement_url")
    @Expose
    private String advertisementUrl;
    @SerializedName("active_status")
    @Expose
    private String activeStatus;
    @SerializedName("view_status")
    @Expose
    private String viewStatus;
    @SerializedName("last_timeline_id")
    @Expose
    private String last_timeline_id;
    public String getUnread_chat() {
        return unread_chat;
    }

    public void setUnread_chat(String unread_chat) {
        this.unread_chat = unread_chat;
    }

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public String getUnread_notification() {
        return unread_notification;
    }

    public void setUnread_notification(String unread_notification) {
        this.unread_notification = unread_notification;
    }

    public String getUnread_timeline_notification() {
        return unread_timeline_notification;
    }

    public void setUnread_timeline_notification(String unread_timeline_notification) {
        this.unread_timeline_notification = unread_timeline_notification;
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

    public String getAdvertisementUrl() {
        return advertisementUrl;
    }

    public void setAdvertisementUrl(String advertisementUrl) {
        this.advertisementUrl = advertisementUrl;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getViewStatus() {
        return viewStatus;
    }

    public void setViewStatus(String viewStatus) {
        this.viewStatus = viewStatus;
    }

    public String getLast_timeline_id() {
        return last_timeline_id;
    }

    public void setLast_timeline_id(String last_timeline_id) {
        this.last_timeline_id = last_timeline_id;
    }
}
