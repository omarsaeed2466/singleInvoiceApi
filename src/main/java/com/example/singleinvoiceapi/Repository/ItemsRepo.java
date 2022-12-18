package com.example.singleinvoiceapi.Repository;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ItemsRepo {
    private long items_id ;
   private String ITEM_CODE ;
    private int PURCHASED_QUANTITY ;
    private double PRICE ;
    private String NAMEEN ;
    private String NAMEAR ;


}
