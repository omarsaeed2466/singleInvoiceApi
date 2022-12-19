package com.example.singleinvoiceapi.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;
import lombok.Data;

import java.io.Serializable;
@Data
public class Discount  {

    @JsonProperty("value")
    private int value ;
    @JsonProperty("type")
    private String type ;



}
