package com.example.singleinvoiceapi;

import com.example.singleinvoiceapi.SingleInvoice.Customer;
import com.example.singleinvoiceapi.SingleInvoice.Discount;
import com.example.singleinvoiceapi.SingleInvoice.Items;
import com.example.singleinvoiceapi.SingleInvoice.ReqInvoiceImp;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@SpringBootTest
@SpringBootApplication
public class fetchApi {

    String url   = "https://atfawry.fawrystaging.com/invoice-api/invoices/single";
    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOlsidW0iLCJvcmRlciIsImludiIsIm1hY2MiLCJmcCIsImJlLXByb2ZpbGUiXSwic3ViIjoiYXRhbXNuMjUzQGdtYWlsLmNvbSIsInJsbSI6IkJFIiwiZnBhIjoiNDAwMDAwMDA5ODI2IiwidXN0IjoiQlVTSU5FU1NfRU5USVRZIiwiYmVpIjoxMDgzNCwiaXNzIjoiZmF3cnkuY29tIiwiZXhwIjoxNjc0NDUxMzMzLCJpYXQiOjE2NzA4NTEzMzMsImp0aSI6IjQ0NDAzZjJlLTIxYTMtNDc0MC04YTY2LThlNmZlOTlmOGJiOSJ9._yiuNcm" +
            "c-9w0pnVBXTjJtbhL1whYHfknR8bIFApg75U";
@Test
   public void postRequest(){
 try {
  RestTemplate restTemplate = new RestTemplate();

  HttpHeaders headers = new HttpHeaders();
  headers.set("Authorization", "Bearer " + token);
  headers.setContentType(MediaType.APPLICATION_JSON);
  //req
  ReqInvoiceImp body = new ReqInvoiceImp();
//cus
     Customer customer = new Customer();
     customer.setName("mohamed");
   customer.setEmail("mohamedsamir@gmail.com");
     customer.setMobil("0123556677");
     body.setCustomer(customer);
     //continue req
      body.setAmount(150.00);
      body.setSendingDate("2022-12-12");
        body.setExpiryDate("2023-02-28T13:19:17.000Z");
  body.setReleaseDate("2022-12-12T13:16:50.668Z");
  body.setBusinessReference("99");
  body.setNote("invoice description");
  body.setCommunicationLang("en-gb");
  body.setCommunicationMethod("SMS");
  body.setAlertMerchantUponExpiry(false);
  // items
  Items items = new Items();
  items.setItemCode("b2f35ed2d39e462abd5e4b1129a7305d");
  items.setPurchasedQuantity(2);
  items.setPrice(150.55);
     items.setNameEn("description 1");
     items.setNameAr("product description 1");
  //discount
     Discount discount = new Discount();
     discount.setType("FLAT");
     discount.setValue( 20);
     items.setDiscount(discount);

     body.setPaymentType("PUSH_TO_CUSTOMER");





  ArrayList<Items> arrayList = new ArrayList<>();
  arrayList.add(items);
  body.setItems(arrayList);


/*
  String s = "{\n" +
          "                \"customer\": {\n" +
          "                    \"name\": \"mohamed\",\n" +
          "                    \"email\": \"mohamedsamir@gmail.com\",\n" +
          "                    \"mobile\": \"0123556677\"\n" +
          "                },\n" +
          "                \"amount\": 150.00,\n" +
          "                \"sendingDate\": \"2022-12-12\",\n" +
          "                \"expiryDate\": \"2023-02-28T13:19:17.000Z\",\n" +
          "                \"releaseDate\": \"2022-12-12T13:16:50.668Z\",\n" +
          "                \"businessReference\": \"80\",\n" +
          "                \"note\": \"invoice description\",\n" +
          "                \"communicationLang\": \"en-gb\",\n" +
          "                \"communicationMethod\": \"SMS\",\n" +
          "                \"alertMerchantUponExpiry\": \"false\",\n" +
          "                \"items\": [\n" +
          "                    {\n" +
          "                        \"itemCode\": \"b2f35ed2d39e462abd5e4b1129a7305d\",\n" +
          "                        \"purchasedQuantity\": 1,\n" +
          "                        \"price\": 150,\n" +
          "                        \"nameEn\" : \"description 1\",\n" +
          "                        \"nameAr\" : \"وصف المنتج\",\n" +
          "                        \"discount\": {\n" +
          "                            \"value\": 20,\n" +
          "                            \"type\": \"FLAT\"\n" +
          "                                     }\n" +
          "                    }\n" +
          "                ],\n" +
          "                \"paymentType\": \"PUSH_TO_CUSTOMER\",\n" +
          "                \"taxes\": []\n" +
          "        \n" +
          "}";
*/
  Gson g = new Gson();
 //JsonObject js = g.fromJson(s,JsonObject.class);
 String json = new ObjectMapper().writeValueAsString(body);


  //HttpEntity<String> entity = new HttpEntity<String>(s, headers);

     System.out.println(json);
     HttpEntity<String> entity = new HttpEntity<String>(json, headers);
  ResponseEntity<String> res = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
  System.out.println(res.getBody());

 }catch (Exception e){
  throw new RuntimeException(e);
 }
}
}
