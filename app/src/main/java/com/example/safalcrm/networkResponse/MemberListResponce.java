package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MemberListResponce implements Serializable {


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
        @SerializedName("user_first_name")
        @Expose
        private String userFirstName;
        @SerializedName("user_last_name")
        @Expose
        private String userLastName;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("company_name")
        @Expose
        private String companyName;
        @SerializedName("user_mobile")
        @Expose
        private String userMobile;
        @SerializedName("public_mobile")
        @Expose
        private String publicMobile;
        @SerializedName("member_date_of_birth")
        @Expose
        private String memberDateOfBirth;
        @SerializedName("alt_mobile")
        @Expose
        private String altMobile;
        @SerializedName("user_profile_pic")
        @Expose
        private String userProfilePic;
        @SerializedName("block_status")
        @Expose
        private Boolean blockStatus;

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

        public String getUserFirstName() {
            return userFirstName;
        }

        public void setUserFirstName(String userFirstName) {
            this.userFirstName = userFirstName;
        }

        public String getUserLastName() {
            return userLastName;
        }

        public void setUserLastName(String userLastName) {
            this.userLastName = userLastName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getUserMobile() {
            return userMobile;
        }

        public void setUserMobile(String userMobile) {
            this.userMobile = userMobile;
        }

        public String getPublicMobile() {
            return publicMobile;
        }

        public void setPublicMobile(String publicMobile) {
            this.publicMobile = publicMobile;
        }

        public String getMemberDateOfBirth() {
            return memberDateOfBirth;
        }

        public void setMemberDateOfBirth(String memberDateOfBirth) {
            this.memberDateOfBirth = memberDateOfBirth;
        }

        public String getAltMobile() {
            return altMobile;
        }

        public void setAltMobile(String altMobile) {
            this.altMobile = altMobile;
        }

        public String getUserProfilePic() {
            return userProfilePic;
        }

        public void setUserProfilePic(String userProfilePic) {
            this.userProfilePic = userProfilePic;
        }

        public Boolean getBlockStatus() {
            return blockStatus;
        }

        public void setBlockStatus(Boolean blockStatus) {
            this.blockStatus = blockStatus;
        }
    }
}
