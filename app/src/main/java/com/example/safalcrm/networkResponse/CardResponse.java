package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CardResponse implements Serializable{

    @SerializedName("visit_card")
    @Expose
    private List<VisitCard> visitCard = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<VisitCard> getVisitCard() {
        return visitCard;
    }

    public void setVisitCard(List<VisitCard> visitCard) {
        this.visitCard = visitCard;
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

    public class VisitCard implements Serializable {

        @SerializedName("card_id")
        @Expose
        private String cardId;
        @SerializedName("card_empty")
        @Expose
        private String cardEmpty;
        @SerializedName("card_bg")
        @Expose
        private String cardBg;
        @SerializedName("is_logo")
        @Expose
        private boolean isLogo;

        public boolean isLogo() {
            return isLogo;
        }

        public void setLogo(boolean logo) {
            isLogo = logo;
        }

        public String getCardId() {
            return cardId;
        }

        public void setCardId(String cardId) {
            this.cardId = cardId;
        }

        public String getCardEmpty() {
            return cardEmpty;
        }

        public void setCardEmpty(String cardEmpty) {
            this.cardEmpty = cardEmpty;
        }

        public String getCardBg() {
            return cardBg;
        }

        public void setCardBg(String cardBg) {
            this.cardBg = cardBg;
        }
    }


}
