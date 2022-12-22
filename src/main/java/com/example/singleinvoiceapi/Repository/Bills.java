package com.example.singleinvoiceapi.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private String  FAWRY_REEF ;



    @Override
    public String toString() {
        return "Bills{" +
                "id=" + id +
                ", Customer_name='" + Customer_name + '\'' +
                ", Customer_email='" + Customer_email + '\'' +
                ", Customer_mobil='" + Customer_mobil + '\'' +
                ", amount=" + amount +
                ", SENDING_DATE='" + SENDING_DATE + '\'' +
                ", EXPIRY_DATE='" + EXPIRY_DATE + '\'' +
                ", RELEASE_DATE='" + RELEASE_DATE + '\'' +
                ", BUSINESS_REFERENCE='" + BUSINESS_REFERENCE + '\'' +
                ", NOTE='" + NOTE + '\'' +
                ", COMMUNICATION_LANG='" + COMMUNICATION_LANG + '\'' +
                ", COMMUNICATION_METHOD='" + COMMUNICATION_METHOD + '\'' +
                ", itemsRepo=" + itemsRepo +
                ", ALERTMERCHANTUPON_EXPIRY='" + ALERTMERCHANTUPON_EXPIRY + '\'' +
                ", PAYMENT_TYPE='" + PAYMENT_TYPE + '\'' +
                '}';
    }
}
