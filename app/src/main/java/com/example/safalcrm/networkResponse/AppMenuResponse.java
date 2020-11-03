package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AppMenuResponse {
    @SerializedName("appmenu")
    @Expose
    private List<Appmenu> appmenu = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Appmenu> getAppmenu() {
        return appmenu;
    }

    public void setAppmenu(List<Appmenu> appmenu) {
        this.appmenu = appmenu;
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

    public class Appmenu {

        @SerializedName("app_menu_id")
        @Expose
        private String appMenuId;
        @SerializedName("menu_title")
        @Expose
        private String menuTitle;
        @SerializedName("menu_click")
        @Expose
        private String menuClick;
        @SerializedName("ios_menu_click")
        @Expose
        private String iosMenuClick;
        @SerializedName("menu_icon")
        @Expose
        private String menuIcon;
        @SerializedName("menu_sequence")
        @Expose
        private String menuSequence;
        @SerializedName("tutorial_video")
        @Expose
        private String tutorialVideo;
        @SerializedName("is_new")
        @Expose
        private Boolean isNew;

        @SerializedName("appmenu_sub")
        @Expose
        private List<AppMenuSub> appMenuSub = null;

        public String getAppMenuId() {
            return appMenuId;
        }

        public void setAppMenuId(String appMenuId) {
            this.appMenuId = appMenuId;
        }

        public String getMenuTitle() {
            return menuTitle;
        }

        public void setMenuTitle(String menuTitle) {
            this.menuTitle = menuTitle;
        }

        public String getMenuClick() {
            return menuClick;
        }

        public void setMenuClick(String menuClick) {
            this.menuClick = menuClick;
        }

        public String getIosMenuClick() {
            return iosMenuClick;
        }

        public void setIosMenuClick(String iosMenuClick) {
            this.iosMenuClick = iosMenuClick;
        }

        public String getMenuIcon() {
            return menuIcon;
        }

        public void setMenuIcon(String menuIcon) {
            this.menuIcon = menuIcon;
        }

        public String getMenuSequence() {
            return menuSequence;
        }

        public void setMenuSequence(String menuSequence) {
            this.menuSequence = menuSequence;
        }

        public String getTutorialVideo() {
            return tutorialVideo;
        }

        public void setTutorialVideo(String tutorialVideo) {
            this.tutorialVideo = tutorialVideo;
        }

        public Boolean getIsNew() {
            return isNew;
        }

        public void setIsNew(Boolean isNew) {
            this.isNew = isNew;
        }

        public List<AppMenuSub> getAppMenuSub() {
            return appMenuSub;
        }

        public void setAppMenuSub(List<AppMenuSub> appMenuSub) {
            this.appMenuSub = appMenuSub;
        }
    }

    public class AppMenuSub {
        @SerializedName("app_menu_id")
        @Expose
        private String appMenuId;
        @SerializedName("menu_title")
        @Expose
        private String menuTitle;
        @SerializedName("menu_click")
        @Expose
        private String menuClick;
        @SerializedName("ios_menu_click")
        @Expose
        private String iosMenuClick;
        @SerializedName("menu_icon")
        @Expose
        private String menuIcon;
        @SerializedName("menu_sequence")
        @Expose
        private String menuSequence;
        @SerializedName("tutorial_video")
        @Expose
        private String tutorialVideo;
        @SerializedName("is_new")
        @Expose
        private Boolean isNew;

        public String getAppMenuId() {
            return appMenuId;
        }

        public void setAppMenuId(String appMenuId) {
            this.appMenuId = appMenuId;
        }

        public String getMenuTitle() {
            return menuTitle;
        }

        public void setMenuTitle(String menuTitle) {
            this.menuTitle = menuTitle;
        }

        public String getMenuClick() {
            return menuClick;
        }

        public void setMenuClick(String menuClick) {
            this.menuClick = menuClick;
        }

        public String getIosMenuClick() {
            return iosMenuClick;
        }

        public void setIosMenuClick(String iosMenuClick) {
            this.iosMenuClick = iosMenuClick;
        }

        public String getMenuIcon() {
            return menuIcon;
        }

        public void setMenuIcon(String menuIcon) {
            this.menuIcon = menuIcon;
        }

        public String getMenuSequence() {
            return menuSequence;
        }

        public void setMenuSequence(String menuSequence) {
            this.menuSequence = menuSequence;
        }

        public String getTutorialVideo() {
            return tutorialVideo;
        }

        public void setTutorialVideo(String tutorialVideo) {
            this.tutorialVideo = tutorialVideo;
        }

        public Boolean getIsNew() {
            return isNew;
        }

        public void setIsNew(Boolean isNew) {
            this.isNew = isNew;
        }
    }
}
