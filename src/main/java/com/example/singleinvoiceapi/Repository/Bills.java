package com.example.singleinvoiceapi.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Bills {
    @JsonProperty("id")
private long id ;
@JsonProperty("customer_name")
private String Customer_name ;
    @JsonProperty("Customer_email")
    private String Customer_email ;
    @JsonProperty("Customer_mobil")
    private String Customer_mobil ;
    @JsonProperty("amount")
    private  double amount ;
    @JsonProperty("SENDING_DATE")
    private String SENDING_DATE;
    @JsonProperty("EXPIRY_DATE")
    private String  EXPIRY_DATE ;
    @JsonProperty("RELEASE_DATE")
    private String RELEASE_DATE ;
    @JsonProperty("BUSINESS_REFERENCE")
   private String BUSINESS_REFERENCE ;
    @JsonProperty("NOTE")
    private String NOTE ;
    @JsonProperty("COMMUNICATION_LANG")
    private String  COMMUNICATION_LANG ;
    @JsonProperty("COMMUNICATION_METHOD")
    private String COMMUNICATION_METHOD ;
    @JsonProperty("itemsRepo")
    private List<ItemsRepo> itemsRepo ;
    @JsonProperty("ALERTMERCHANTUPON_EXPIRY")
    private String ALERTMERCHANTUPON_EXPIRY ;
    @JsonProperty("PAYMENT_TYPE")
    private String PAYMENT_TYPE ;


    public Bills(String customer_name, String customer_mobil, String customer_email, double amount, String sending_date, String expiry_date, String release_date, String business_reference, String note, List<ItemsRepo> itemsRepo, String alertmerchantupon_expiry, String communication_method, String communication_lang, String payment_type, boolean b) {
    }
}
