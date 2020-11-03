package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class RecentMemberListResponce implements Serializable {


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

        @SerializedName("chat_id")
        @Expose
        private String chatId;
        @SerializedName("msg_data")
        @Expose
        private String msgData;
        @SerializedName("msg_date")
        @Expose
        private String msgDate;
        @SerializedName("flag")
        @Expose
        private String flag;
        @SerializedName("member_size")
        @Expose
        private String memberSize;
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
        @SerializedName("chatCount")
        @Expose
        private String chatCount;
        private final static long serialVersionUID = 157247173676584967L;

        public String getChatId() {
            return chatId;
        }

        public void setChatId(String chatId) {
            this.chatId = chatId;
        }

        public String getMsgData() {
            return msgData;
        }

        public void setMsgData(String msgData) {
            this.msgData = msgData;
        }

        public String getMsgDate() {
            return msgDate;
        }

        public void setMsgDate(String msgDate) {
            this.msgDate = msgDate;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public String getMemberSize() {
            return memberSize;
        }

        public void setMemberSize(String memberSize) {
            this.memberSize = memberSize;
        }

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

        public String getChatCount() {
            return chatCount;
        }

        public void setChatCount(String chatCount) {
            this.chatCount = chatCount;
        }
    }
}
