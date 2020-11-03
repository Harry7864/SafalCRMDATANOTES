package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MemeberProfileResponse {

    @SerializedName("memberAdded")
    @Expose
    private String memberAdded;
    @SerializedName("member_added_details")
    @Expose
    private List<MemberAddedDetail> memberAddedDetails = null;

    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("user_full_name")
    @Expose
    private String userFullName;
    @SerializedName("user_mobile")
    @Expose
    private String userMobile;
    @SerializedName("public_mobile")
    @Expose
    private String public_mobile;

    @SerializedName("block_status")
    @Expose
    private Boolean block_status;

    public String getPublic_mobile() {
        return public_mobile;
    }

    public void setPublic_mobile(String public_mobile) {
        this.public_mobile = public_mobile;
    }

    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("whatsapp_number")
    @Expose
    private String whatsappNumber;

    @SerializedName("whatsapp_number_click")
    @Expose
    private String whatsapp_number_click;

    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("alt_mobile")
    @Expose
    private String altMobile;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("instagram")
    @Expose
    private String instagram;
    @SerializedName("linkedin")
    @Expose
    private String linkedin;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("user_profile_pic")
    @Expose
    private String userProfilePic;
    @SerializedName("follow_status")
    @Expose
    private Boolean followStatus;
    @SerializedName("bussiness_category_name")
    @Expose
    private String bussinessCategoryName;
    @SerializedName("sub_category_name")
    @Expose
    private String subCategoryName;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("company_logo")
    @Expose
    private String companyLogo;
    @SerializedName("company_logo_name")
    @Expose
    private String companyLogoName;
    @SerializedName("company_broucher")
    @Expose
    private String companyBroucher;
    @SerializedName("company_broucher_name")
    @Expose
    private String companyBroucherName;
    @SerializedName("company_profile")
    @Expose
    private String companyProfile;
    @SerializedName("compny_profile_name")
    @Expose
    private String compnyProfileName;
    @SerializedName("products_servicess")
    @Expose
    private String productsServicess;
    @SerializedName("billing_address")
    @Expose
    private String billingAddress;
    @SerializedName("gst_number")
    @Expose
    private String gstNumber;
    @SerializedName("billing_pincode")
    @Expose
    private String billingPincode;
    @SerializedName("bank_name")
    @Expose
    private String bankName;
    @SerializedName("ifsc_code")
    @Expose
    private String ifscCode;
    @SerializedName("billing_contact_person")
    @Expose
    private String billingContactPerson;
    @SerializedName("billing_contact_person_name")
    @Expose
    private String billingContactPersonName;


    @SerializedName("company_contact_number")
    @Expose
    private String company_contact_number;
    @SerializedName("company_email")
    @Expose
    private String company_email;

    public String getBusiness_description() {
        return business_description;
    }

    public void setBusiness_description(String business_description) {
        this.business_description = business_description;
    }

    @SerializedName("business_description")
    @Expose
    private String business_description;
    @SerializedName("company_address")
    @Expose
    private List<AddressResponse.CompanyAddress> companyAddress = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

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

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getAltMobile() {
        return altMobile;
    }

    public void setAltMobile(String altMobile) {
        this.altMobile = altMobile;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public Boolean getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(Boolean followStatus) {
        this.followStatus = followStatus;
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

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyLogoName() {
        return companyLogoName;
    }

    public void setCompanyLogoName(String companyLogoName) {
        this.companyLogoName = companyLogoName;
    }

    public String getCompanyBroucher() {
        return companyBroucher;
    }

    public void setCompanyBroucher(String companyBroucher) {
        this.companyBroucher = companyBroucher;
    }

    public String getCompanyBroucherName() {
        return companyBroucherName;
    }

    public void setCompanyBroucherName(String companyBroucherName) {
        this.companyBroucherName = companyBroucherName;
    }

    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    public String getCompnyProfileName() {
        return compnyProfileName;
    }

    public void setCompnyProfileName(String compnyProfileName) {
        this.compnyProfileName = compnyProfileName;
    }

    public String getProductsServicess() {
        return productsServicess;
    }

    public void setProductsServicess(String productsServicess) {
        this.productsServicess = productsServicess;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getBillingPincode() {
        return billingPincode;
    }

    public void setBillingPincode(String billingPincode) {
        this.billingPincode = billingPincode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBillingContactPerson() {
        return billingContactPerson;
    }

    public void setBillingContactPerson(String billingContactPerson) {
        this.billingContactPerson = billingContactPerson;
    }

    public String getBillingContactPersonName() {
        return billingContactPersonName;
    }

    public void setBillingContactPersonName(String billingContactPersonName) {
        this.billingContactPersonName = billingContactPersonName;
    }

    public List<AddressResponse.CompanyAddress> getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(List<AddressResponse.CompanyAddress> companyAddress) {
        this.companyAddress = companyAddress;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public Boolean getBlock_status() {
        return block_status;
    }

    public void setBlock_status(Boolean block_status) {
        this.block_status = block_status;
    }

    public String getCompany_contact_number() {
        return company_contact_number;
    }

    public void setCompany_contact_number(String company_contact_number) {
        this.company_contact_number = company_contact_number;
    }

    public String getCompany_email() {
        return company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public String getWhatsapp_number_click() {
        return whatsapp_number_click;
    }

    public void setWhatsapp_number_click(String whatsapp_number_click) {
        this.whatsapp_number_click = whatsapp_number_click;
    }

    public String getMemberAdded() {
        return memberAdded;
    }

    public void setMemberAdded(String memberAdded) {
        this.memberAdded = memberAdded;
    }

    public List<MemberAddedDetail> getMemberAddedDetails() {
        return memberAddedDetails;
    }

    public void setMemberAddedDetails(List<MemberAddedDetail> memberAddedDetails) {
        this.memberAddedDetails = memberAddedDetails;
    }

    public class MemberAddedDetail {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("refer_by")
        @Expose
        private String referBy;
        @SerializedName("refere_by_name")
        @Expose
        private String refereByName;
        @SerializedName("refere_by_phone_number")
        @Expose
        private String refereByPhoneNumber;
        @SerializedName("remark")
        @Expose
        private String remark;
        @SerializedName("register_date")
        @Expose
        private String registerDate;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getReferBy() {
            return referBy;
        }

        public void setReferBy(String referBy) {
            this.referBy = referBy;
        }

        public String getRefereByName() {
            return refereByName;
        }

        public void setRefereByName(String refereByName) {
            this.refereByName = refereByName;
        }

        public String getRefereByPhoneNumber() {
            return refereByPhoneNumber;
        }

        public void setRefereByPhoneNumber(String refereByPhoneNumber) {
            this.refereByPhoneNumber = refereByPhoneNumber;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRegisterDate() {
            return registerDate;
        }

        public void setRegisterDate(String registerDate) {
            this.registerDate = registerDate;
        }

    }
}
