package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class NewsFeedResponce implements Serializable {

    @SerializedName("feed")
    @Expose
    private List<Newsfeed> newsfeeds = null;

    @SerializedName("status")
    @Expose
    private
    String status;

    @SerializedName("message")
    @Expose
    private
    String message;

    @SerializedName("total_post")
    @Expose
    private
    String total_post;
    @SerializedName("followers")
    @Expose
    private
    String followers;
    @SerializedName("following")
    @Expose
    private
    String following;
    @SerializedName("follow_status")
    @Expose
    private
    Boolean follow_status;
    @SerializedName("pos1")
    @Expose
    private
    int pos1;
    @SerializedName("totalFeed")
    @Expose
    private
    String totalFeed;
    @SerializedName("totalSocietyFeedLimit")
    @Expose
    private
    String totalSocietyFeed;
    @SerializedName("unread_notification")
    @Expose
    private
    int unreadNotification;

    public String getTotal_post() {
        return total_post;
    }

    public void setTotal_post(String total_post) {
        this.total_post = total_post;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public Boolean getFollow_status() {
        return follow_status;
    }

    public void setFollow_status(Boolean follow_status) {
        this.follow_status = follow_status;
    }

    public int getPos1() {
        return pos1;
    }

    public void setPos1(int pos1) {
        this.pos1 = pos1;
    }

    public String getTotalSocietyFeed() {
        return totalSocietyFeed;
    }

    public void setTotalSocietyFeed(String totalSocietyFeed) {
        this.totalSocietyFeed = totalSocietyFeed;
    }

    public String getTotalFeed() {
        return totalFeed;
    }

    public void setTotalFeed(String totalFeed) {
        this.totalFeed = totalFeed;
    }

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

    public List<Newsfeed> getNewsfeeds() {
        return newsfeeds;
    }

    public void setNewsfeeds(List<Newsfeed> newsfeeds) {
        this.newsfeeds = newsfeeds;
    }

    public int getUnreadNotification() {
        return unreadNotification;
    }

    public void setUnreadNotification(int unreadNotification) {
        this.unreadNotification = unreadNotification;
    }

    public static class Newsfeed implements Serializable {

        @SerializedName("like")
        @Expose
        private List<Like> newslike = null;

        @SerializedName("comment")
        @Expose
        private List<Comment> newscomment = null;

        @SerializedName("timeline_id")
        @Expose
        private String feedId;
        @SerializedName("feed_type")
        @Expose
        private String feedType;
        @SerializedName("timeline_text")
        @Expose
        private String feedMsg;
        @SerializedName("user_name")
        @Expose
        private String userName;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("company_name")
        @Expose
        private String companyName;

        @SerializedName("timeline_photos")
        @Expose
        private List<FeedImg> feedImg;

        @SerializedName("user_profile_pic")
        @Expose
        private String userProfilePic;

        @SerializedName("modify_date")
        @Expose
        private String modify_date;

        @SerializedName("like_status")
        @Expose
        private String likeStatus;

        @SerializedName("totalLikes")
        @Expose
        private String totalLikes;

        @SerializedName("comment_status")
        @Expose
        private String commentStatus;

        private boolean isSecound = false;

        public boolean isSecound() {
            return isSecound;
        }

        public void setSecound(boolean secound) {
            isSecound = secound;
        }

        public Newsfeed(String feedId, String feedType) {
            this.feedId = feedId;
            this.feedType = feedType;
        }

        public String getLikeStatus() {
            return likeStatus;
        }

        public void setLikeStatus(String likeStatus) {
            this.likeStatus = likeStatus;
        }

        public String getCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(String commentStatus) {
            this.commentStatus = commentStatus;
        }

        public String getModify_date() {
            return modify_date;
        }

        public void setModify_date(String modify_date) {
            this.modify_date = modify_date;
        }

        public String getFeedId() {
            return feedId;
        }

        public void setFeedId(String feedId) {
            this.feedId = feedId;
        }

        public String getFeedType() {
            return feedType;
        }

        public void setFeedType(String feedType) {
            this.feedType = feedType;
        }


        public String getFeedMsg() {
            return feedMsg;
        }

        public void setFeedMsg(String feedMsg) {
            this.feedMsg = feedMsg;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }


        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }


        public String getUserProfilePic() {
            return userProfilePic;
        }

        public void setUserProfilePic(String userProfilePic) {
            this.userProfilePic = userProfilePic;
        }

        public List<Like> getNewslike() {
            return newslike;
        }

        public void setNewslike(List<Like> newslike) {
            this.newslike = newslike;
        }

        public List<Comment> getNewscomment() {
            return newscomment;
        }

        public void setNewscomment(List<Comment> newscomment) {
            this.newscomment = newscomment;
        }

        public List<FeedImg> getFeedImg() {
            return feedImg;
        }

        public void setFeedImg(List<FeedImg> feedImg) {
            this.feedImg = feedImg;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(String totalLikes) {
            this.totalLikes = totalLikes;
        }
    }

    public static class Like implements Serializable {

        @SerializedName("timeline_id")
        @Expose
        private String feedId;
        @SerializedName("like_id")
        @Expose
        private String like_id;
        @SerializedName("user_id")
        @Expose
        private String user_id;
        @SerializedName("user_name")
        @Expose
        private String user_name;
        @SerializedName("user_profile_pic")
        @Expose
        private String userProfilePic;
        @SerializedName("modify_date")
        @Expose
        private String modify_date;


        public String getFeedId() {
            return feedId;
        }

        public void setFeedId(String feedId) {
            this.feedId = feedId;
        }

        public String getLike_id() {
            return like_id;
        }

        public void setLike_id(String like_id) {
            this.like_id = like_id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getModify_date() {
            return modify_date;
        }

        public void setModify_date(String modify_date) {
            this.modify_date = modify_date;
        }

        public String getUserProfilePic() {
            return userProfilePic;
        }

        public void setUserProfilePic(String userProfilePic) {
            this.userProfilePic = userProfilePic;
        }
    }

    public static class Comment implements Serializable {

        @SerializedName("timeline_id")
        @Expose
        private String feedId;
        @SerializedName("comments_id")
        @Expose
        private String comments_id;
        @SerializedName("user_id")
        @Expose
        private String user_id;
        @SerializedName("user_name")
        @Expose
        private String user_name;
        @SerializedName("msg")
        @Expose
        private String msg;
        @SerializedName("modify_date")
        @Expose
        private String modify_date;

        @SerializedName("user_profile_pic")
        @Expose
        private String user_profile_pic;

        @SerializedName("sub_comment")
        @Expose
        private List<SubComment> subComment = null;

        public String getUser_profile_pic() {
            return user_profile_pic;
        }

        public void setUser_profile_pic(String user_profile_pic) {
            this.user_profile_pic = user_profile_pic;
        }

        public String getFeedId() {
            return feedId;
        }

        public void setFeedId(String feedId) {
            this.feedId = feedId;
        }

        public String getComments_id() {
            return comments_id;
        }

        public void setComments_id(String comments_id) {
            this.comments_id = comments_id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }


        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getModify_date() {
            return modify_date;
        }

        public void setModify_date(String modify_date) {
            this.modify_date = modify_date;
        }

        public List<SubComment> getSubComment() {
            return subComment;
        }

        public void setSubComment(List<SubComment> subComment) {
            this.subComment = subComment;
        }
    }

    public static class SubComment implements Serializable {

        @SerializedName("timeline_id")
        @Expose
        private String feedId;
        @SerializedName("comments_id")
        @Expose
        private String comments_id;
        @SerializedName("user_id")
        @Expose
        private String user_id;
        @SerializedName("user_name")
        @Expose
        private String user_name;
        @SerializedName("msg")
        @Expose
        private String msg;
        @SerializedName("modify_date")
        @Expose
        private String modify_date;

        @SerializedName("user_profile_pic")
        @Expose
        private String user_profile_pic;


        public String getUser_profile_pic() {
            return user_profile_pic;
        }

        public void setUser_profile_pic(String user_profile_pic) {
            this.user_profile_pic = user_profile_pic;
        }

        public String getFeedId() {
            return feedId;
        }

        public void setFeedId(String feedId) {
            this.feedId = feedId;
        }

        public String getComments_id() {
            return comments_id;
        }

        public void setComments_id(String comments_id) {
            this.comments_id = comments_id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getModify_date() {
            return modify_date;
        }

        public void setModify_date(String modify_date) {
            this.modify_date = modify_date;
        }
    }


    public static class FeedImg implements Serializable {
        @SerializedName("photo_name")
        @Expose
        private String feedImg;
        @SerializedName("feed_height")
        @Expose
        private String feedHeight;
        @SerializedName("feed_width")
        @Expose
        private String feedWidth;

        public String getFeedImg() {
            return feedImg;
        }

        public void setFeedImg(String feedImg) {
            this.feedImg = feedImg;
        }

        public String getFeedHeight() {
            return feedHeight;
        }

        public void setFeedHeight(String feedHeight) {
            this.feedHeight = feedHeight;
        }

        public String getFeedWidth() {
            return feedWidth;
        }

        public void setFeedWidth(String feedWidth) {
            this.feedWidth = feedWidth;
        }
    }
}
