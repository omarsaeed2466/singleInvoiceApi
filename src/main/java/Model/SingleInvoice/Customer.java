package Model.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;

import java.io.Serializable;

public class Customer  {
    @JsonProperty("name")
    private String name ;
    @JsonProperty("email")
    private String email ;
    @JsonProperty("mobile")
    private String mobil ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }
}
