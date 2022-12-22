package Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FawryLoginReq {
    @JsonProperty("userIdentifier")
     private String userIdentifier ;
    @JsonProperty("password")
    private String password ;

}
