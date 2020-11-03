package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CircularsResponse {
    @SerializedName("circular")
    @Expose
    private List<Circular> circular = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Circular> getCircular() {
        return circular;
    }

    public void setCircular(List<Circular> circular) {
        this.circular = circular;
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


    public class Circular {
        @SerializedName("circular_id")
        @Expose
        private String circularId;
        @SerializedName("circular_title")
        @Expose
        private String circularTitle;
        @SerializedName("circular_description")
        @Expose
        private String circularDescription;
        @SerializedName("notice_time")
        @Expose
        private String noticeTime;

        public String getCircularId() {
            return circularId;
        }

        public void setCircularId(String circularId) {
            this.circularId = circularId;
        }

        public String getCircularTitle() {
            return circularTitle;
        }

        public void setCircularTitle(String circularTitle) {
            this.circularTitle = circularTitle;
        }

        public String getCircularDescription() {
            return circularDescription;
        }

        public void setCircularDescription(String circularDescription) {
            this.circularDescription = circularDescription;
        }

        public String getNoticeTime() {
            return noticeTime;
        }

        public void setNoticeTime(String noticeTime) {
            this.noticeTime = noticeTime;
        }
    }
}
