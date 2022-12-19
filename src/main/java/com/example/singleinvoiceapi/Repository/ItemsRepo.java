package com.example.singleinvoiceapi.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ItemsRepo {
    @JsonProperty("items_id ")
    private long items_id ;
    @JsonProperty("ITEM_CODE ")
   private String ITEM_CODE ;
    @JsonProperty("PURCHASED_QUANTITY ")
    private int PURCHASED_QUANTITY ;
    @JsonProperty("PRICE ")
    private double PRICE ;
    @JsonProperty("NAMEEN ")
    private String NAMEEN ;
    @JsonProperty("NAMEAR ")
    private String NAMEAR ;

    public ItemsRepo(String ITEM_CODE, int PURCHASED_QUANTITY, double PRICE, String NAMEEN, String NAMEAR) {
        this.ITEM_CODE = ITEM_CODE;
        this.PURCHASED_QUANTITY = PURCHASED_QUANTITY;
        this.PRICE = PRICE;
        this.NAMEEN = NAMEEN;
        this.NAMEAR = NAMEAR;
    }

    public ItemsRepo(long items_id, String ITEM_CODE, int PURCHASED_QUANTITY, double PRICE, String NAMEEN, String NAMEAR) {
        this.items_id = items_id;
        this.ITEM_CODE = ITEM_CODE;
        this.PURCHASED_QUANTITY = PURCHASED_QUANTITY;
        this.PRICE = PRICE;
        this.NAMEEN = NAMEEN;
        this.NAMEAR = NAMEAR;
    }
}
