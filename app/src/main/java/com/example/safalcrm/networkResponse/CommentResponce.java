package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CommentResponce implements Serializable {

    @SerializedName("status")
    @Expose
    private
    String status;
    @SerializedName("message")
    @Expose
    private
    String message;

    @SerializedName("comment")
    @Expose
    private List<NewsFeedResponce.Comment> newsComment = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<NewsFeedResponce.Comment> getNewsComment() {
        return newsComment;
    }
    public void setNewsComment(List<NewsFeedResponce.Comment> newsComment) {
        this.newsComment = newsComment;
    }
}
