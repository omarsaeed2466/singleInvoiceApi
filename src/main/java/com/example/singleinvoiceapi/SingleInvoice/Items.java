package com.example.singleinvoiceapi.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Items   {

    @JsonProperty("itemCode")
    private String itemCode ;
    @JsonProperty("purchasedQuantity")
   private int purchasedQuantity ;
    @JsonProperty("price")
  private double  price ;

    @JsonProperty("nameEn")
   private String nameEn ;
    @JsonProperty("nameAr")
    private String nameAr ;
    @JsonProperty("discount")
    private Discount discount ;


}
