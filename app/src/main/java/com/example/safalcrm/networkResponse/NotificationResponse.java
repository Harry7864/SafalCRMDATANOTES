package com.example.safalcrm.networkResponse;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class NotificationResponse implements Serializable {
    @SerializedName("notification")
    @Expose
    private List<Notification> notification = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Notification> getNotification() {
        return notification;
    }

    public void setNotification(List<Notification> notification) {
        this.notification = notification;
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

    public class Notification implements Serializable {

        @SerializedName("user_notification_id")
        @Expose
        private String userNotificationId;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("notification_title")
        @Expose
        private String notificationTitle;
        @SerializedName("notification_desc")
        @Expose
        private String notificationDesc;
        @SerializedName("notification_logo")
        @Expose
        private String notificationLogo;

        @SerializedName("notification_img_url")
        @Expose
        private String notification_img_url;

        @SerializedName("notification_date")
        @Expose
        private String notificationDate;
        @SerializedName("notification_status")
        @Expose
        private String notificationStatus;
        @SerializedName("notification_type")
        @Expose
        private String notificationType;
        @SerializedName("other_user_id")
        @Expose
        private String otherUserId;
        @SerializedName("timeline_id")
        @Expose
        private String timelineId;
        @SerializedName("notification_action")
        @Expose
        private String notificationAction;


        public String getUserNotificationId() {
            return userNotificationId;
        }

        public void setUserNotificationId(String userNotificationId) {
            this.userNotificationId = userNotificationId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getNotificationTitle() {
            return notificationTitle;
        }

        public void setNotificationTitle(String notificationTitle) {
            this.notificationTitle = notificationTitle;
        }

        public String getNotificationDesc() {
            return notificationDesc;
        }

        public void setNotificationDesc(String notificationDesc) {
            this.notificationDesc = notificationDesc;
        }

        public String getNotificationLogo() {
            return notificationLogo;
        }

        public void setNotificationLogo(String notificationLogo) {
            this.notificationLogo = notificationLogo;
        }

        public String getNotificationDate() {
            return notificationDate;
        }

        public void setNotificationDate(String notificationDate) {
            this.notificationDate = notificationDate;
        }

        public String getNotificationStatus() {
            return notificationStatus;
        }

        public void setNotificationStatus(String notificationStatus) {
            this.notificationStatus = notificationStatus;
        }

        public String getNotificationType() {
            return notificationType;
        }

        public void setNotificationType(String notificationType) {
            this.notificationType = notificationType;
        }

        public String getOtherUserId() {
            return otherUserId;
        }

        public void setOtherUserId(String otherUserId) {
            this.otherUserId = otherUserId;
        }

        public String getTimelineId() {
            return timelineId;
        }

        public void setTimelineId(String timelineId) {
            this.timelineId = timelineId;
        }

        public String getNotificationAction() {
            return notificationAction;
        }

        public void setNotificationAction(String notificationAction) {
            this.notificationAction = notificationAction;
        }

        public String getNotification_img_url() {
            return notification_img_url;
        }

        public void setNotification_img_url(String notification_img_url) {
            this.notification_img_url = notification_img_url;
        }
    }
}
