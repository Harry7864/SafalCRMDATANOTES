package com.example.safalcrm.networkResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class FrameAndImagesResponse implements Serializable {
    @SerializedName("frames")
    @Expose
    private List<Frame> frames = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
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

    public class Frame implements Serializable
    {

        @SerializedName("frame_id")
        @Expose
        private String frameId;
        @SerializedName("frame_name")
        @Expose
        private String frameName;
        @SerializedName("frame_image")
        @Expose
        private String frameImage;
        @SerializedName("layout_name")
        @Expose
        private String layout_name;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("images")
        @Expose
        private List<Image> images = null;

        public String getLayout_name() {
            return layout_name;
        }

        public void setLayout_name(String layout_name) {
            this.layout_name = layout_name;
        }

        public String getFrameId() {
            return frameId;
        }

        public void setFrameId(String frameId) {
            this.frameId = frameId;
        }

        public String getFrameName() {
            return frameName;
        }

        public void setFrameName(String frameName) {
            this.frameName = frameName;
        }

        public String getFrameImage() {
            return frameImage;
        }

        public void setFrameImage(String frameImage) {
            this.frameImage = frameImage;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<Image> getImages() {
            return images;
        }

        public void setImages(List<Image> images) {
            this.images = images;
        }

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
