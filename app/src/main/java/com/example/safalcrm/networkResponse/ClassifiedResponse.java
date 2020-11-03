package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ClassifiedResponse implements Serializable {

    @SerializedName("discussion")
    @Expose
    private List<Discussion> discussion = null;
    @SerializedName("cllassified_mute")
    @Expose
    private String cllassifiedMute;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Discussion> getDiscussion() {
        return discussion;
    }

    public void setDiscussion(List<Discussion> discussion) {
        this.discussion = discussion;
    }

    public String getCllassifiedMute() {
        return cllassifiedMute;
    }

    public void setCllassifiedMute(String cllassifiedMute) {
        this.cllassifiedMute = cllassifiedMute;
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
    public class Discussion implements Serializable {
        @SerializedName("cllassified_id")
        @Expose
        private String cllassifiedId;
        @SerializedName("business_category_id")
        @Expose
        private String businessCategoryId;
        @SerializedName("business_sub_category_id")
        @Expose
        private String businessSubCategoryId;

        public List<City> getCity() {
            return city;
        }

        public void setCity(List<City> city) {
            this.city = city;
        }

        @SerializedName("city")
        @Expose
        private List<City> city = null;

        @SerializedName("cllassified_title")
        @Expose
        private String cllassifiedTitle;
        @SerializedName("cllassified_description")
        @Expose
        private String cllassifiedDescription;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("cllassified_photo")
        @Expose
        private String cllassifiedPhoto;
        @SerializedName("cllassified_file")
        @Expose
        private String cllassifiedFile;
        @SerializedName("user_profile")
        @Expose
        private String userProfile;
        @SerializedName("created_by")
        @Expose
        private String createdBy;
        @SerializedName("mute_status")
        @Expose
        private Boolean muteStatus;
        @SerializedName("total_coments")
        @Expose
        private String totalComents;
        @SerializedName("comment")
        @Expose
        private List<Comment> comment = null;

        public String getCllassifiedId() {
            return cllassifiedId;
        }

        public void setCllassifiedId(String cllassifiedId) {
            this.cllassifiedId = cllassifiedId;
        }

        public String getBusinessCategoryId() {
            return businessCategoryId;
        }

        public void setBusinessCategoryId(String businessCategoryId) {
            this.businessCategoryId = businessCategoryId;
        }

        public String getBusinessSubCategoryId() {
            return businessSubCategoryId;
        }

        public void setBusinessSubCategoryId(String businessSubCategoryId) {
            this.businessSubCategoryId = businessSubCategoryId;
        }


        public String getCllassifiedTitle() {
            return cllassifiedTitle;
        }

        public void setCllassifiedTitle(String cllassifiedTitle) {
            this.cllassifiedTitle = cllassifiedTitle;
        }

        public String getCllassifiedDescription() {
            return cllassifiedDescription;
        }

        public void setCllassifiedDescription(String cllassifiedDescription) {
            this.cllassifiedDescription = cllassifiedDescription;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getCllassifiedPhoto() {
            return cllassifiedPhoto;
        }

        public void setCllassifiedPhoto(String cllassifiedPhoto) {
            this.cllassifiedPhoto = cllassifiedPhoto;
        }

        public String getCllassifiedFile() {
            return cllassifiedFile;
        }

        public void setCllassifiedFile(String cllassifiedFile) {
            this.cllassifiedFile = cllassifiedFile;
        }

        public String getUserProfile() {
            return userProfile;
        }

        public void setUserProfile(String userProfile) {
            this.userProfile = userProfile;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public Boolean getMuteStatus() {
            return muteStatus;
        }

        public void setMuteStatus(Boolean muteStatus) {
            this.muteStatus = muteStatus;
        }

        public String getTotalComents() {
            return totalComents;
        }

        public void setTotalComents(String totalComents) {
            this.totalComents = totalComents;
        }

        public List<Comment> getComment() {
            return comment;
        }

        public void setComment(List<Comment> comment) {
            this.comment = comment;
        }

    }


    public class City implements Serializable{
        @SerializedName("city_id")
        @Expose
        private String city_id;
        @SerializedName("city_name")
        @Expose
        private String city_name;

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }
    }
    public class Comment  implements Serializable{

        @SerializedName("comment_id")
        @Expose
        private String commentId;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("comment_messaage")
        @Expose
        private String commentMessaage;
        @SerializedName("comment_created_date")
        @Expose
        private String commentCreatedDate;
        @SerializedName("created_by")
        @Expose
        private String createdBy;

        @SerializedName("user_profile")
        @Expose
        private String user_profile;

        @SerializedName("sub_comment")
        @Expose
        private List<SubComment> subComments = null;

        public String getCommentId() {
            return commentId;
        }

        public void setCommentId(String commentId) {
            this.commentId = commentId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getCommentMessaage() {
            return commentMessaage;
        }

        public void setCommentMessaage(String commentMessaage) {
            this.commentMessaage = commentMessaage;
        }

        public String getCommentCreatedDate() {
            return commentCreatedDate;
        }

        public void setCommentCreatedDate(String commentCreatedDate) {
            this.commentCreatedDate = commentCreatedDate;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public List<SubComment> getSubComments() {
            return subComments;
        }

        public void setSubComments(List<SubComment> subComments) {
            this.subComments = subComments;
        }

        public String getUser_profile() {
            return user_profile;
        }

        public void setUser_profile(String user_profile) {
            this.user_profile = user_profile;
        }
    }
    public class SubComment  implements Serializable{

        @SerializedName("comment_id")
        @Expose
        private String commentId;
        @SerializedName("prent_comment_id")
        @Expose
        private String prent_comment_id;

        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("comment_messaage")
        @Expose
        private String commentMessaage;
        @SerializedName("comment_created_date")
        @Expose
        private String commentCreatedDate;
        @SerializedName("created_by")
        @Expose
        private String createdBy;

        public String getPrent_comment_id() {
            return prent_comment_id;
        }

        public void setPrent_comment_id(String prent_comment_id) {
            this.prent_comment_id = prent_comment_id;
        }

        public String getUser_profile() {
            return user_profile;
        }

        public void setUser_profile(String user_profile) {
            this.user_profile = user_profile;
        }

        @SerializedName("user_profile")
        @Expose
        private String user_profile;

        public String getCommentId() {
            return commentId;
        }

        public void setCommentId(String commentId) {
            this.commentId = commentId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getCommentMessaage() {
            return commentMessaage;
        }

        public void setCommentMessaage(String commentMessaage) {
            this.commentMessaage = commentMessaage;
        }

        public String getCommentCreatedDate() {
            return commentCreatedDate;
        }

        public void setCommentCreatedDate(String commentCreatedDate) {
            this.commentCreatedDate = commentCreatedDate;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

    }

}
