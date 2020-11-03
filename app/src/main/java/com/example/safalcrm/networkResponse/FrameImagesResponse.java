package com.example.safalcrm.networkResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
public class FrameImagesResponse {
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
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
    public class Image implements Serializable
    {

        @SerializedName("banner_id")
        @Expose
        private String bannerId;
        @SerializedName("frame_id")
        @Expose
        private String frameId;
        @SerializedName("banner_image")
        @Expose
        private String bannerImage;
        @SerializedName("active_status")
        @Expose
        private String activeStatus;
        @SerializedName("created_date")
        @Expose
        private String createdDate;

        public String getBannerId() {
            return bannerId;
        }

        public void setBannerId(String bannerId) {
            this.bannerId = bannerId;
        }

        public String getFrameId() {
            return frameId;
        }

        public void setFrameId(String frameId) {
            this.frameId = frameId;
        }

        public String getBannerImage() {
            return bannerImage;
        }

        public void setBannerImage(String bannerImage) {
            this.bannerImage = bannerImage;
        }

        public String getActiveStatus() {
            return activeStatus;
        }

        public void setActiveStatus(String activeStatus) {
            this.activeStatus = activeStatus;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

    }
}
