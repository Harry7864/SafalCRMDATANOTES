package com.example.safalcrm.networkResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MemberPlanListResponse implements Serializable
{

    @SerializedName("package")
    @Expose
    private List<Package> packages = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
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

    public class Package implements Serializable
    {

        @SerializedName("package_id")
        @Expose
        private String packageId;
        @SerializedName("package_name")
        @Expose
        private String packageName;
        @SerializedName("package_description")
        @Expose
        private String packageDescription;
        @SerializedName("package_amount")
        @Expose
        private String packageAmount;
        @SerializedName("package_with_amount")
        @Expose
        private String package_with_amount;
        @SerializedName("gst_amount")
        @Expose
        private String gst_amount;
        @SerializedName("no_of_month")
        @Expose
        private String noOfMonth;

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getPackageDescription() {
            return packageDescription;
        }

        public void setPackageDescription(String packageDescription) {
            this.packageDescription = packageDescription;
        }

        public String getPackageAmount() {
            return packageAmount;
        }

        public void setPackageAmount(String packageAmount) {
            this.packageAmount = packageAmount;
        }

        public String getNoOfMonth() {
            return noOfMonth;
        }

        public void setNoOfMonth(String noOfMonth) {
            this.noOfMonth = noOfMonth;
        }

        public String getPackageId() {
            return packageId;
        }

        public void setPackageId(String packageId) {
            this.packageId = packageId;
        }

        public String getPackage_with_amount() {
            return package_with_amount;
        }

        public void setPackage_with_amount(String package_with_amount) {
            this.package_with_amount = package_with_amount;
        }

        public String getGst_amount() {
            return gst_amount;
        }

        public void setGst_amount(String gst_amount) {
            this.gst_amount = gst_amount;
        }
    }
}