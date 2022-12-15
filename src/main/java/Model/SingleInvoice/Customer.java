package Model.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class Customer  {
    @JsonProperty("name")
    private String name ;
    @JsonProperty("email")
    private String email ;
    @JsonProperty("mobile")
    private String mobil ;

}
