package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class EmojiResponse extends CommonResponse {

    @SerializedName("emoji_category")
    @Expose
    private List<EmojiCategory> emojiCategory = null;

    public List<EmojiCategory> getEmojiCategory() {
        return emojiCategory;
    }

    public void setEmojiCategory(List<EmojiCategory> emojiCategory) {
        this.emojiCategory = emojiCategory;
    }

    public static class EmojiCategory implements Serializable {

        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("character")
        @Expose
        private String character;
        @SerializedName("unicodeName")
        @Expose
        private String unicodeName;
        @SerializedName("codePoint")
        @Expose
        private String codePoint;
        @SerializedName("group")
        @Expose
        private String group;
        @SerializedName("subGroup")
        @Expose
        private String subGroup;

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }

        public String getUnicodeName() {
            return unicodeName;
        }

        public void setUnicodeName(String unicodeName) {
            this.unicodeName = unicodeName;
        }

        public String getCodePoint() {
            return codePoint;
        }

        public void setCodePoint(String codePoint) {
            this.codePoint = codePoint;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getSubGroup() {
            return subGroup;
        }

        public void setSubGroup(String subGroup) {
            this.subGroup = subGroup;
        }

        @SerializedName("emoji_category")
        @Expose
        private String emojiCategory;
        @SerializedName("emoji")
        @Expose
        private List<Emoji> emoji = null;

        public String getEmojiCategory() {
            return emojiCategory;
        }

        public void setEmojiCategory(String emojiCategory) {
            this.emojiCategory = emojiCategory;
        }

        public List<Emoji> getEmoji() {
            return emoji;
        }

        public void setEmoji(List<Emoji> emoji) {
            this.emoji = emoji;
        }

        public static class Emoji {

            @SerializedName("emoji_id")
            @Expose
            private String emojiId;
            @SerializedName("emoji_name")
            @Expose
            private String emojiName;
            @SerializedName("emoji_file")
            @Expose
            private String emojiFile;

            public String getEmojiId() {
                return emojiId;
            }

            public void setEmojiId(String emojiId) {
                this.emojiId = emojiId;
            }

            public String getEmojiName() {
                return emojiName;
            }

            public void setEmojiName(String emojiName) {
                this.emojiName = emojiName;
            }

            public String getEmojiFile() {
                return emojiFile;
            }

            public void setEmojiFile(String emojiFile) {
                this.emojiFile = emojiFile;
            }

        }
    }
}