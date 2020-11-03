package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ChatResponse implements Serializable {

    @SerializedName("chat")
    @Expose
    private List<Chat> chat = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("block_status")
    @Expose
    private String blockStatus;


    public List<Chat> getChat() {
        return chat;
    }

    public void setChat(List<Chat> chat) {
        this.chat = chat;
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

    public String getBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(String blockStatus) {
        this.blockStatus = blockStatus;
    }

    public static class Chat implements Serializable{

        @SerializedName("chat_id")
        @Expose
        private String chatId;
        @SerializedName("society_id")
        @Expose
        private String societyId;
        @SerializedName("msg_by")
        @Expose
        private String msgBy;
        @SerializedName("msg_for")
        @Expose
        private String msgFor;

        @SerializedName("msg_type")
        @Expose
        private String msgType;

        @SerializedName("msg_img")
        @Expose
        private String msgImg;

        @SerializedName("msg_data")
        @Expose
        private String msgData;
        @SerializedName("msg_status")
        @Expose
        private String msgStatus;
        @SerializedName("msg_delete")
        @Expose
        private String msgDelete;
        @SerializedName("msg_date")
        @Expose
        private String msgDate;
        @SerializedName("msg_date_view")
        @Expose
        private String msgDateView;
        @SerializedName("my_msg")
        @Expose
        private String myMsg;
        @SerializedName("chat_id_reply")
        @Expose
        private String chatIdReply;
        @SerializedName("reply_msg")
        @Expose
        private String replyMsg;
        @SerializedName("reply_msg_img")
        @Expose
        private String replyMsgImg;
        @SerializedName("reply_msg_type")
        @Expose
        private String replyMsgType;
        @SerializedName("reply_user_name")
        @Expose
        private String replyUserName;

        @SerializedName("file_original_name")
        @Expose
        private String file_original_name;

        @SerializedName("file_duration")
        @Expose
        private String file_duration;

        public String getFile_duration() {
            return file_duration;
        }

        public void setFile_duration(String file_duration) {
            this.file_duration = file_duration;
        }

        public String getFile_original_name() {
            return file_original_name;
        }

        public void setFile_original_name(String file_original_name) {
            this.file_original_name = file_original_name;
        }

        public String getLocation_lat_long() {
            return location_lat_long;
        }

        public void setLocation_lat_long(String location_lat_long) {
            this.location_lat_long = location_lat_long;
        }

        public String getFile_size() {
            return file_size;
        }

        public void setFile_size(String file_size) {
            this.file_size = file_size;
        }

        @SerializedName("location_lat_long")
        @Expose
        private String location_lat_long;
        @SerializedName("file_size")
        @Expose
        private String file_size;

        @SerializedName("isDate")
        @Expose
        private boolean isDate = false;

        @SerializedName("isUploading")
        @Expose
        private boolean isUploading = false;


        public boolean isDate() {
            return isDate;
        }

        public String getMsgType() {
            return msgType;
        }

        public void setMsgType(String msgType) {
            this.msgType = msgType;
        }

        public String getMsgImg() {
            return msgImg;
        }

        public boolean isUploading() {
            return isUploading;
        }

        public void setUploading(boolean uploading) {
            isUploading = uploading;
        }

        public void setMsgImg(String msgImg) {
            this.msgImg = msgImg;
        }

        public void setDate(boolean date) {
            isDate = date;
        }

        public String getMsgDateView() {
            return msgDateView;
        }

        public void setMsgDateView(String msgDateView) {
            this.msgDateView = msgDateView;
        }

        public String getChatId() {
            return chatId;
        }

        public void setChatId(String chatId) {
            this.chatId = chatId;
        }

        public String getSocietyId() {
            return societyId;
        }

        public void setSocietyId(String societyId) {
            this.societyId = societyId;
        }

        public String getMsgBy() {
            return msgBy;
        }

        public void setMsgBy(String msgBy) {
            this.msgBy = msgBy;
        }

        public String getMsgFor() {
            return msgFor;
        }

        public void setMsgFor(String msgFor) {
            this.msgFor = msgFor;
        }

        public String getMsgData() {
            return msgData;
        }

        public void setMsgData(String msgData) {
            this.msgData = msgData;
        }

        public String getMsgStatus() {
            return msgStatus;
        }

        public void setMsgStatus(String msgStatus) {
            this.msgStatus = msgStatus;
        }

        public String getMsgDelete() {
            return msgDelete;
        }

        public void setMsgDelete(String msgDelete) {
            this.msgDelete = msgDelete;
        }

        public String getMsgDate() {
            return msgDate;
        }

        public void setMsgDate(String msgDate) {
            this.msgDate = msgDate;
        }

        public String getMyMsg() {
            return myMsg;
        }

        public void setMyMsg(String myMsg) {
            this.myMsg = myMsg;
        }

        public String getChatIdReply() {
            return chatIdReply;
        }

        public void setChatIdReply(String chatIdReply) {
            this.chatIdReply = chatIdReply;
        }

        public String getReplyMsg() {
            return replyMsg;
        }

        public void setReplyMsg(String replyMsg) {
            this.replyMsg = replyMsg;
        }

        public String getReplyMsgImg() {
            return replyMsgImg;
        }

        public void setReplyMsgImg(String replyMsgImg) {
            this.replyMsgImg = replyMsgImg;
        }

        public String getReplyMsgType() {
            return replyMsgType;
        }

        public void setReplyMsgType(String replyMsgType) {
            this.replyMsgType = replyMsgType;
        }

        public String getReplyUserName() {
            return replyUserName;
        }

        public void setReplyUserName(String replyUserName) {
            this.replyUserName = replyUserName;
        }
    }
}
