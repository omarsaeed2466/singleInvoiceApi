package Model.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;

import java.io.Serializable;

public class Discount  {

    @JsonProperty("value")
    private int value ;
    @JsonProperty("type")
    private String type ;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
