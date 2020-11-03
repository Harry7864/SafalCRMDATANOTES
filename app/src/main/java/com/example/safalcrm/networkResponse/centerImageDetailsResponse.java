package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class centerImageDetailsResponse implements Serializable {

    @SerializedName("centerImageDetails")
    @Expose
    private List<CenterImageDetail> centerImageDetails = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<CenterImageDetail> getCenterImageDetails() {
        return centerImageDetails;
    }

    public void setCenterImageDetails(List<CenterImageDetail> centerImageDetails) {
        this.centerImageDetails = centerImageDetails;
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

    public class CenterImageDetail {

        @SerializedName("promotion_id")
        @Expose
        private String promotionId;
        @SerializedName("promotion_center_image_id")
        @Expose
        private String promotionCenterImageId;
        @SerializedName("promotion_frame_id")
        @Expose
        private String promotionFrameId;
        @SerializedName("promotion_center_image")
        @Expose
        private String promotionCenterImage;
        @SerializedName("promotion_frame")
        @Expose
        private String promotionFrame;
        @SerializedName("event_date")
        @Expose
        private String eventDate;
        @SerializedName("event_status")
        @Expose
        private String eventStatus;

        @SerializedName("text_color")
        @Expose
        private String text_color;

        public String getPromotionId() {
            return promotionId;
        }

        public void setPromotionId(String promotionId) {
            this.promotionId = promotionId;
        }

        public String getPromotionCenterImageId() {
            return promotionCenterImageId;
        }

        public void setPromotionCenterImageId(String promotionCenterImageId) {
            this.promotionCenterImageId = promotionCenterImageId;
        }

        public String getPromotionFrameId() {
            return promotionFrameId;
        }

        public void setPromotionFrameId(String promotionFrameId) {
            this.promotionFrameId = promotionFrameId;
        }

        public String getPromotionCenterImage() {
            return promotionCenterImage;
        }

        public void setPromotionCenterImage(String promotionCenterImage) {
            this.promotionCenterImage = promotionCenterImage;
        }

        public String getPromotionFrame() {
            return promotionFrame;
        }

        public void setPromotionFrame(String promotionFrame) {
            this.promotionFrame = promotionFrame;
        }

        public String getEventDate() {
            return eventDate;
        }

        public void setEventDate(String eventDate) {
            this.eventDate = eventDate;
        }

        public String getEventStatus() {
            return eventStatus;
        }

        public void setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
        }

        public String getText_color() {
            return text_color;
        }

        public void setText_color(String text_color) {
            this.text_color = text_color;
        }
    }
}
