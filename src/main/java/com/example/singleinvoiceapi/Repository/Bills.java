package com.example.singleinvoiceapi.Repository;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
    private ItemsRepo itemsRepo ;
    private String ALERTMERCHANTUPON_EXPIRY ;
    private String PAYMENT_TYPE ;


    public Bills(String customer_name, String customer_mobil, String customer_email, double amount, String sending_date, String expiry_date, String release_date, String business_reference, String note, ItemsRepo itemsRepo, String alertmerchantupon_expiry, String communication_method, String communication_lang, String payment_type, boolean b) {
    }
}
