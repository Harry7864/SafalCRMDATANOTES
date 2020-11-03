package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BusinessHousesResponse {
    @SerializedName("member")
    @Expose
    private List<Member> member = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
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


    public class Member {

        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("user_full_name")
        @Expose
        private String userFullName;
        @SerializedName("user_profile_pic")
        @Expose
        private String userProfilePic;
        @SerializedName("total_post")
        @Expose
        private String totalPost;
        @SerializedName("followers")
        @Expose
        private String followers;
        @SerializedName("following")
        @Expose
        private String following;
        @SerializedName("bussiness_category_name")
        @Expose
        private String bussinessCategoryName;
        @SerializedName("sub_category_name")
        @Expose
        private String subCategoryName;

        public Boolean getFollow_status() {
            return follow_status;
        }

        public void setFollow_status(Boolean follow_status) {
            this.follow_status = follow_status;
        }

        @SerializedName("company_name")
        @Expose
        private String companyName;

        @SerializedName("follow_status")
        @Expose
        private Boolean follow_status;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserFullName() {
            return userFullName;
        }

        public void setUserFullName(String userFullName) {
            this.userFullName = userFullName;
        }

        public String getUserProfilePic() {
            return userProfilePic;
        }

        public void setUserProfilePic(String userProfilePic) {
            this.userProfilePic = userProfilePic;
        }

        public String getTotalPost() {
            return totalPost;
        }

        public void setTotalPost(String totalPost) {
            this.totalPost = totalPost;
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

        public String getBussinessCategoryName() {
            return bussinessCategoryName;
        }

        public void setBussinessCategoryName(String bussinessCategoryName) {
            this.bussinessCategoryName = bussinessCategoryName;
        }

        public String getSubCategoryName() {
            return subCategoryName;
        }

        public void setSubCategoryName(String subCategoryName) {
            this.subCategoryName = subCategoryName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

    }
}
