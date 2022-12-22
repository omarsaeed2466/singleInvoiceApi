package com.example.singleinvoiceapi.SingleInvoice;

import Model.FawryLoginReq;
import Model.FawryLoginRes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@Service
public class FawryAdapterService  {
    String urlLogin   = "https://atfawry.fawrystaging.com/user-api/auth/login";
    @Value("${fawry.userIdentifier}")
    String username;
    @Value("${fawry.userPassword}")
    String password;

    private static String token;
   private RestTemplate restTemplate = new RestTemplate() ;
    //Login Function

    public FawryAdapterService(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }
    HttpHeaders createHeaders(String username  , String password){
return new HttpHeaders(){{
    final String basicAuth = HttpHeaders.encodeBasicAuth(username,password, StandardCharsets.US_ASCII);
    setBasicAuth(basicAuth);
}};
    }
    private FawryLoginRes login() throws JsonProcessingException {
        FawryLoginReq req = new FawryLoginReq(username,password);
        String json = new ObjectMapper().writeValueAsString(req);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<String>(json, headers);
        final ResponseEntity<FawryLoginRes> responseEntity = restTemplate.exchange(urlLogin, HttpMethod.POST,entity, FawryLoginRes.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            FawryLoginRes res= responseEntity.getBody();
            token = res.getToken();
            return res;
        }
        System.out.println(responseEntity.getBody());
        return null;
    }

    //Registeration / send invoice

    // callback Function






}
