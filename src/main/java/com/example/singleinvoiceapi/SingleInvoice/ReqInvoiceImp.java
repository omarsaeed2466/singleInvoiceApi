package com.example.singleinvoiceapi.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class ReqInvoiceImp  {
   @JsonProperty("customer")
   private Customer customer ;
    @JsonProperty("amount")
    private double amount ;
    @JsonProperty("sendingDate")
    private String sendingDate ;
    @JsonProperty("expiryDate")
    private String expiryDate ;
    @JsonProperty("releaseDate")
    private String releaseDate ;
    @JsonProperty("businessReference")
    private String businessReference ;
    @JsonProperty("note")
    private String note ;
    @JsonProperty("communicationLang")
    private String communicationLang ;
    @JsonProperty("communicationMethod")
    private String  communicationMethod;
    @JsonProperty("alertMerchantUponExpiry")
    private Boolean alertMerchantUponExpiry ;
    @JsonProperty("items")
    private ArrayList<Items>  items = new ArrayList<Items>() ;
    @JsonProperty("paymentType")
    private String    paymentType ;
    @JsonProperty("taxes")
    private List<Map<String,Object>> taxes;
    @JsonProperty("preferredPaymentMethod")
   private String preferredPaymentMethod ;

    public ReqInvoiceImp() {
    }


}