package com.example.singleinvoiceapi.Repository;

public class ItemsRepo {
    private long items_id ;
   private String ITEM_CODE ;
    private int PURCHASED_QUANTITY ;
    private double PRICE ;
    private String NAMEEN ;
    private String NAMEAR ;

    public ItemsRepo(long items_id, String ITEM_CODE, int PURCHASED_QUANTITY, double PRICE, String NAMEEN, String NAMEAR) {
        this.items_id = items_id;
        this.ITEM_CODE = ITEM_CODE;
        this.PURCHASED_QUANTITY = PURCHASED_QUANTITY;
        this.PRICE = PRICE;
        this.NAMEEN = NAMEEN;
        this.NAMEAR = NAMEAR;
    }

    public ItemsRepo(String ITEM_CODE, int PURCHASED_QUANTITY, double PRICE, String NAMEEN, String NAMEAR) {
        this.ITEM_CODE = ITEM_CODE;
        this.PURCHASED_QUANTITY = PURCHASED_QUANTITY;
        this.PRICE = PRICE;
        this.NAMEEN = NAMEEN;
        this.NAMEAR = NAMEAR;
    }

    public long getItems_id() {
        return items_id;
    }

    public void setItems_id(long items_id) {
        this.items_id = items_id;
    }

    public String getITEM_CODE() {
        return ITEM_CODE;
    }

    public void setITEM_CODE(String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
    }

    public int getPURCHASED_QUANTITY() {
        return PURCHASED_QUANTITY;
    }

    public void setPURCHASED_QUANTITY(int PURCHASED_QUANTITY) {
        this.PURCHASED_QUANTITY = PURCHASED_QUANTITY;
    }

    public double getPRICE() {
        return PRICE;
    }

    public void setPRICE(double PRICE) {
        this.PRICE = PRICE;
    }

    public String getNAMEEN() {
        return NAMEEN;
    }

    public void setNAMEEN(String NAMEEN) {
        this.NAMEEN = NAMEEN;
    }

    public String getNAMEAR() {
        return NAMEAR;
    }

    public void setNAMEAR(String NAMEAR) {
        this.NAMEAR = NAMEAR;
    }
}
