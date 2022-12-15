package com.example.singleinvoiceapi.Repository;

public class Bills {
private long id ;
private String Customer_name ;
    private String Customer_email ;
    private String Customer_mobil ;
    private  double amount ;
    private String SENDING_DATE;
    private String  EXPIRY_DATE ;
    private String RELEASE_DATE ;
   private String BUSINESS_REFERENCE ;
    private String NOTE ;
    private String  COMMUNICATION_LANG ;
    private String COMMUNICATION_METHOD ;
    private String ALERTMERCHANTUPON_EXPIRY ;
    private String PAYMENT_TYPE ;

    public Bills(long id, String customer_name, String customer_email, String customer_mobil, double amount, String SENDING_DATE, String EXPIRY_DATE, String RELEASE_DATE, String BUSINESS_REFERENCE, String NOTE, String COMMUNICATION_LANG, String COMMUNICATION_METHOD, String ALERTMERCHANTUPON_EXPIRY, String PAYMENT_TYPE) {
        this.id = id;
        Customer_name = customer_name;
        Customer_email = customer_email;
        Customer_mobil = customer_mobil;
        this.amount = amount;
        this.SENDING_DATE = SENDING_DATE;
        this.EXPIRY_DATE = EXPIRY_DATE;
        this.RELEASE_DATE = RELEASE_DATE;
        this.BUSINESS_REFERENCE = BUSINESS_REFERENCE;
        this.NOTE = NOTE;
        this.COMMUNICATION_LANG = COMMUNICATION_LANG;
        this.COMMUNICATION_METHOD = COMMUNICATION_METHOD;
        this.ALERTMERCHANTUPON_EXPIRY = ALERTMERCHANTUPON_EXPIRY;
        this.PAYMENT_TYPE = PAYMENT_TYPE;
    }

    public Bills(String customer_name, String customer_email, String customer_mobil, double amount, String SENDING_DATE, String EXPIRY_DATE, String RELEASE_DATE, String BUSINESS_REFERENCE, String NOTE, String COMMUNICATION_LANG, String COMMUNICATION_METHOD, String ALERTMERCHANTUPON_EXPIRY, String PAYMENT_TYPE) {
        Customer_name = customer_name;
        Customer_email = customer_email;
        Customer_mobil = customer_mobil;
        this.amount = amount;
        this.SENDING_DATE = SENDING_DATE;
        this.EXPIRY_DATE = EXPIRY_DATE;
        this.RELEASE_DATE = RELEASE_DATE;
        this.BUSINESS_REFERENCE = BUSINESS_REFERENCE;
        this.NOTE = NOTE;
        this.COMMUNICATION_LANG = COMMUNICATION_LANG;
        this.COMMUNICATION_METHOD = COMMUNICATION_METHOD;
        this.ALERTMERCHANTUPON_EXPIRY = ALERTMERCHANTUPON_EXPIRY;
        this.PAYMENT_TYPE = PAYMENT_TYPE;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public String getCustomer_email() {
        return Customer_email;
    }

    public void setCustomer_email(String customer_email) {
        Customer_email = customer_email;
    }

    public String getCustomer_mobil() {
        return Customer_mobil;
    }

    public void setCustomer_mobil(String customer_mobil) {
        Customer_mobil = customer_mobil;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSENDING_DATE() {
        return SENDING_DATE;
    }

    public void setSENDING_DATE(String SENDING_DATE) {
        this.SENDING_DATE = SENDING_DATE;
    }

    public String getEXPIRY_DATE() {
        return EXPIRY_DATE;
    }

    public void setEXPIRY_DATE(String EXPIRY_DATE) {
        this.EXPIRY_DATE = EXPIRY_DATE;
    }

    public String getRELEASE_DATE() {
        return RELEASE_DATE;
    }

    public void setRELEASE_DATE(String RELEASE_DATE) {
        this.RELEASE_DATE = RELEASE_DATE;
    }

    public String getBUSINESS_REFERENCE() {
        return BUSINESS_REFERENCE;
    }

    public void setBUSINESS_REFERENCE(String BUSINESS_REFERENCE) {
        this.BUSINESS_REFERENCE = BUSINESS_REFERENCE;
    }

    public String getNOTE() {
        return NOTE;
    }

    public void setNOTE(String NOTE) {
        this.NOTE = NOTE;
    }

    public String getCOMMUNICATION_LANG() {
        return COMMUNICATION_LANG;
    }

    public void setCOMMUNICATION_LANG(String COMMUNICATION_LANG) {
        this.COMMUNICATION_LANG = COMMUNICATION_LANG;
    }

    public String getCOMMUNICATION_METHOD() {
        return COMMUNICATION_METHOD;
    }

    public void setCOMMUNICATION_METHOD(String COMMUNICATION_METHOD) {
        this.COMMUNICATION_METHOD = COMMUNICATION_METHOD;
    }

    public String getALERTMERCHANTUPON_EXPIRY() {
        return ALERTMERCHANTUPON_EXPIRY;
    }

    public void setALERTMERCHANTUPON_EXPIRY(String ALERTMERCHANTUPON_EXPIRY) {
        this.ALERTMERCHANTUPON_EXPIRY = ALERTMERCHANTUPON_EXPIRY;
    }

    public String getPAYMENT_TYPE() {
        return PAYMENT_TYPE;
    }

    public void setPAYMENT_TYPE(String PAYMENT_TYPE) {
        this.PAYMENT_TYPE = PAYMENT_TYPE;
    }
}
