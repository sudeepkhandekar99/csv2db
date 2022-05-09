package com.batch.model;

public class User {
    private String timestamp;
    private String ver;
    private String product_family;
    private String country;
    private String device_type;
    private String os;
    private String checkout_failure_count;
    private String payment_api_failure_count;
    private String purchase_count;
    private String revenue;

    public User() {
    }

    public User(String timestamp, String ver, String product_family, String country, String device_type, String os, String checkout_failure_count, String payment_api_failure_count, String purchase_count, String revenue) {
        this.timestamp = timestamp;
        this.ver = ver;
        this.product_family = product_family;
        this.country = country;
        this.device_type = device_type;
        this.os = os;
        this.checkout_failure_count = checkout_failure_count;
        this.payment_api_failure_count = payment_api_failure_count;
        this.purchase_count = purchase_count;
        this.revenue = revenue;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getProduct_family() {
        return product_family;
    }

    public void setProduct_family(String product_family) {
        this.product_family = product_family;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCheckout_failure_count() {
        return checkout_failure_count;
    }

    public void setCheckout_failure_count(String checkout_failure_count) {
        this.checkout_failure_count = checkout_failure_count;
    }

    public String getPayment_api_failure_count() {
        return payment_api_failure_count;
    }

    public void setPayment_api_failure_count(String payment_api_failure_count) {
        this.payment_api_failure_count = payment_api_failure_count;
    }

    public String getPurchase_count() {
        return purchase_count;
    }

    public void setPurchase_count(String purchase_count) {
        this.purchase_count = purchase_count;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }
}
