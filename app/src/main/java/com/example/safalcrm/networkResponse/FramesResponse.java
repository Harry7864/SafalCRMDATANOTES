package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class FramesResponse implements Serializable{
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

    public class Frame implements Serializable {

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

    }
}
