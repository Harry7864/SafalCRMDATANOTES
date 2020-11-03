package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BannerResponse {

    @SerializedName("slider")
    @Expose
    private List<Slider> slider = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Slider> getSlider() {
        return slider;
    }

    public void setSlider(List<Slider> slider) {
        this.slider = slider;
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


    public class Slider {

        @SerializedName("app_slider_id")
        @Expose
        private String appSliderId;
        @SerializedName("slider_image_name")
        @Expose
        private String sliderImageName;
        @SerializedName("slider_description")
        @Expose
        private String sliderDescription;
        @SerializedName("slider_url")
        @Expose
        private String sliderUrl;
        @SerializedName("slider_mobile")
        @Expose
        private String sliderMobile;
        @SerializedName("slider_video_url")
        @Expose
        private String sliderVideoUrl;
        @SerializedName("user_id")
        @Expose
        private String user_id;
        public String getAppSliderId() {
            return appSliderId;
        }

        public void setAppSliderId(String appSliderId) {
            this.appSliderId = appSliderId;
        }

        public String getSliderImageName() {
            return sliderImageName;
        }

        public void setSliderImageName(String sliderImageName) {
            this.sliderImageName = sliderImageName;
        }

        public String getSliderDescription() {
            return sliderDescription;
        }

        public void setSliderDescription(String sliderDescription) {
            this.sliderDescription = sliderDescription;
        }

        public String getSliderUrl() {
            return sliderUrl;
        }

        public void setSliderUrl(String sliderUrl) {
            this.sliderUrl = sliderUrl;
        }

        public String getSliderMobile() {
            return sliderMobile;
        }

        public void setSliderMobile(String sliderMobile) {
            this.sliderMobile = sliderMobile;
        }

        public String getSliderVideoUrl() {
            return sliderVideoUrl;
        }

        public void setSliderVideoUrl(String sliderVideoUrl) {
            this.sliderVideoUrl = sliderVideoUrl;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }
    }
}
