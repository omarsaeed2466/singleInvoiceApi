package Model.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
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
