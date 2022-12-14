package Model.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

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
    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }
    public void setPurchasedQuantity(int purchasedQuantity) {
        this.purchasedQuantity = purchasedQuantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public String getNameAr() {
        return nameAr;
    }
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }
}
