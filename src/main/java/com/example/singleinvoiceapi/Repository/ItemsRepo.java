package com.example.singleinvoiceapi.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
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
    @JsonProperty("BILLS_NUM")
    private int BILLS_NUM;

    @Override
    public String toString() {
        return "ItemsRepo{" +
                "items_id=" + items_id +
                ", ITEM_CODE='" + ITEM_CODE + '\'' +
                ", PURCHASED_QUANTITY=" + PURCHASED_QUANTITY +
                ", PRICE=" + PRICE +
                ", NAMEEN='" + NAMEEN + '\'' +
                ", NAMEAR='" + NAMEAR + '\'' +
                ", BILLS_NUM=" + BILLS_NUM +
                '}';
    }
}
