package Model.SingleInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ReqInvoiceImp  {
   @JsonProperty("customer")
   private Customer customer ;
    @JsonProperty("amount")
    private double amount ;
    @JsonProperty("sendingDate")
    private String sendingDate ;
    @JsonProperty("expiryDate")
    private String expiryDate ;
    @JsonProperty("releaseDate")
    private String releaseDate ;
    @JsonProperty("businessReference")
    private String businessReference ;
    @JsonProperty("note")
    private String note ;
    @JsonProperty("communicationLang")
    private String communicationLang ;
    @JsonProperty("communicationMethod")
    private String  communicationMethod;
    @JsonProperty("alertMerchantUponExpiry")
    private Boolean alertMerchantUponExpiry ;
    @JsonProperty("items")
    private ArrayList<Items>  items = new ArrayList<Items>() ;
    @JsonProperty("paymentType")
    private String    paymentType ;
    @JsonProperty("taxes")
    private String taxes;
    @JsonProperty("preferredPaymentMethod")
   private String preferredPaymentMethod ;

    public ReqInvoiceImp() {
    }

    public void setCommunicationMethod(String communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public Boolean getAlertMerchantUponExpiry() {
        return alertMerchantUponExpiry;
    }

    public void setAlertMerchantUponExpiry(Boolean alertMerchantUponExpiry) {
        this.alertMerchantUponExpiry = alertMerchantUponExpiry;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(String sendingDate) {
        this.sendingDate = sendingDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBusinessReference() {
        return businessReference;
    }

    public void setBusinessReference(String businessReference) {
        this.businessReference = businessReference;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCommunicationLang() {
        return communicationLang;
    }

    public void setCommunicationLang(String communicationLang) {
        this.communicationLang = communicationLang;
    }

    public String getCommunicationMethod() {
        return communicationMethod;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }
    /*

    URL url = new URL ("https://atfawry.fawrystaging.com/invoice-api/invoices/single");
    HttpURLConnection con = (HttpURLConnection)url.openConnection();
con.setRequestMethod("POST");
con.setRequestProperty("Content-Type", "application/json; utf-8");
con.setRequestProperty("Accept", "application/json");
con.setRequestProperty ("Authorization","Bearer " + AccessToken); //The token you obtained from the login API
con.setDoOutput(true);
    String jsonInputString = "{
                        "customer": {
        "name": "your customer name",
                "email": "mail@domain.com",
                "mobile": "01234567899"
    },
            "amount": 150.75,
            "sendingDate": "2021-02-27",
            "expiryDate": "2021-02-28T13:19:17.000Z",
            "releaseDate": "2021-02-27T13:16:50.668Z",
            "businessReference": "145556",
            "note": "invoice description",
            "communicationLang": "en-gb",
            "communicationMethod": "SMS",
            "alertMerchantUponExpiry": "false",
            "items": [
    {
        "itemCode": "b2f35ed2d39e462abd5e4b1129a7305d",
            "purchasedQuantity": 2,
            "price": 150.75,
            "nameEn" : "description 1",
            "nameAr" : "description 1",
            "discount": {
        "value": 20,
                "type": "FLAT"
    }
    }
                        ],
                                "paymentType": "PUSH_TO_CUSTOMER",
                                "taxes": 0,
                                "preferredPaymentMethod":"CARD"
";
        try(
    OutputStream os = con.getOutputStream()) {
        byte[] input = jsonInputString.getBytes("utf-8");
        os.write(input, 0, input.length);
        }
        try(
    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8")) {
        StringBuilder response = new StringBuilder();
        String responseLine = null;
        while((responseLine =br.readLine())!=null)

        {
            response.append(responseLine.trim());
        }
        {
        System.out.println(response.toString());
    }

}

     */
}