package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class PromitionEventListResponse  implements Serializable {

    @SerializedName("eventDetails")
    @Expose
    private List<EventDetail> eventDetails = null;

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<EventDetail> getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(List<EventDetail> eventDetails) {
        this.eventDetails = eventDetails;
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

    public class EventDetail implements  Serializable{

        @SerializedName("promotion_id")
        @Expose
        private String promotionId;
        @SerializedName("event_name")
        @Expose
        private String eventName;
        @SerializedName("event_date")
        @Expose
        private String eventDate;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("event_status")
        @Expose
        private String eventStatus;
        @SerializedName("event_status_desc")
        @Expose
        private String eventStatusDesc;
        @SerializedName("event_image")
        @Expose
        private String eventImage;
        @SerializedName("frameDetails")
        @Expose
        private List<FrameDetail> frameDetails = null;

        public String getPromotionId() {
            return promotionId;
        }

        public void setPromotionId(String promotionId) {
            this.promotionId = promotionId;
        }

        public String getEventName() {
            return eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public String getEventDate() {
            return eventDate;
        }

        public void setEventDate(String eventDate) {
            this.eventDate = eventDate;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getEventStatus() {
            return eventStatus;
        }

        public void setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
        }

        public String getEventStatusDesc() {
            return eventStatusDesc;
        }

        public void setEventStatusDesc(String eventStatusDesc) {
            this.eventStatusDesc = eventStatusDesc;
        }

        public String getEventImage() {
            return eventImage;
        }

        public void setEventImage(String eventImage) {
            this.eventImage = eventImage;
        }

        public List<FrameDetail> getFrameDetails() {
            return frameDetails;
        }

        public void setFrameDetails(List<FrameDetail> frameDetails) {
            this.frameDetails = frameDetails;
        }

    }

    public class FrameDetail implements Serializable{

        @SerializedName("promotion_id")
        @Expose
        private String promotionId;
        @SerializedName("promotion_frame_id")
        @Expose
        private String promotionFrameId;
        @SerializedName("promotion_frame")
        @Expose
        private String promotionFrame;
        @SerializedName("event_image")
        @Expose
        private String eventImage;
        @SerializedName("event_date")
        @Expose
        private String eventDate;

        @SerializedName("event_status")
        @Expose
        private String event_status;

        public String getPromotionId() {
            return promotionId;
        }

        public void setPromotionId(String promotionId) {
            this.promotionId = promotionId;
        }

        public String getPromotionFrameId() {
            return promotionFrameId;
        }

        public void setPromotionFrameId(String promotionFrameId) {
            this.promotionFrameId = promotionFrameId;
        }

        public String getPromotionFrame() {
            return promotionFrame;
        }

        public void setPromotionFrame(String promotionFrame) {
            this.promotionFrame = promotionFrame;
        }

        public String getEventImage() {
            return eventImage;
        }

        public void setEventImage(String eventImage) {
            this.eventImage = eventImage;
        }

        public String getEventDate() {
            return eventDate;
        }

        public void setEventDate(String eventDate) {
            this.eventDate = eventDate;
        }

        public String getEvent_status() {
            return event_status;
        }

        public void setEvent_status(String event_status) {
            this.event_status = event_status;
        }
    }
}
