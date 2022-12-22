package com.example.singleinvoiceapi.SingleInvoice;

import com.example.singleinvoiceapi.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.thymeleaf.util.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class BillService  {

BillsJdbcRepostiory  billsJdbcRepostiory ;
ItemsJdbcRepository itemsJdbcRepository;

@Autowired
public BillService(BillsJdbcRepostiory  billsJdbcRepostiory ,ItemsJdbcRepository itemsJdbcRepository ){
    this.billsJdbcRepostiory = billsJdbcRepostiory;
    this.itemsJdbcRepository = itemsJdbcRepository;

}


public ReqInvoiceImp getFawryBillbyid(long billId) throws RuntimeException {
    Bills bill = this.billsJdbcRepostiory.findById(billId);
    if(bill==null)
        throw new RuntimeException("No Bill for this id ");
    List<ItemsRepo> items = this.itemsJdbcRepository.findByBill(billId);
    if(items.size() == 0)
        throw new RuntimeException("No Items for Bill ");

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    ReqInvoiceImp reqInvoiceImp = new ReqInvoiceImp();
    reqInvoiceImp.setAmount(bill.getAmount());
    reqInvoiceImp.setBusinessReference(bill.getBUSINESS_REFERENCE());
    reqInvoiceImp.setCommunicationLang(bill.getCOMMUNICATION_LANG());
    reqInvoiceImp.setCommunicationMethod(bill.getCOMMUNICATION_METHOD());
    reqInvoiceImp.setSendingDate(simpleDateFormat.format(new Date()));
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DAY_OF_MONTH,3);
    reqInvoiceImp.setExpiryDate(simpleDateFormat.format(cal.getTime()));

}

    public ResponseEntity<String> getCreateBills(@RequestBody Bills bills) {
        try {
            billsJdbcRepostiory.save(bills);
            return new ResponseEntity<>("Bills was created successfully.", HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    public ResponseEntity<String> deleteAllBills() {
        try {
            int numRows = billsJdbcRepostiory.deleteAll();
            return new ResponseEntity<>("Deleted " + numRows + " Bills(s) successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Cannot delete billss.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    public ResponseEntity<String> deleteBills(@PathVariable("id") long id) {
        try {
            int result = billsJdbcRepostiory.deleteById(id);
            if (result == 0) {
                return new ResponseEntity<>("Cannot find bills with id=" + id, HttpStatus.OK);
            }
            return new ResponseEntity<>("Bills was deleted successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Cannot delete bills.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody Bills bills) {
        Bills bills1 = (Bills) billsJdbcRepostiory.findById(id);

        if (bills1 != null) {
            bills1.setId(id);
            bills1.setCustomer_name(bills.getCustomer_name());
            bills1.setCustomer_email(bills.getCustomer_email());
            bills1.setCustomer_mobil(bills.getCustomer_mobil());
            bills1.setAmount(bills.getAmount());
            bills1.setSENDING_DATE(bills.getSENDING_DATE());
            bills1.setRELEASE_DATE(bills.getRELEASE_DATE());
            bills1.setEXPIRY_DATE(bills.getEXPIRY_DATE());
            bills1.setNOTE(bills.getNOTE());
            bills1.setBUSINESS_REFERENCE(bills.getBUSINESS_REFERENCE());
            bills1.setItemsRepo(bills.getItemsRepo());
            bills1.setALERTMERCHANTUPON_EXPIRY(bills.getALERTMERCHANTUPON_EXPIRY());
            bills1.setCOMMUNICATION_METHOD(bills.getCOMMUNICATION_METHOD());
            bills1.setCOMMUNICATION_LANG(bills.getCOMMUNICATION_LANG());
            bills1.setPAYMENT_TYPE(bills.getPAYMENT_TYPE());
            bills1.setFAWRY_REEF(bills.getFAWRY_REEF());
            billsJdbcRepostiory.update(bills1);
            return new ResponseEntity<>("Bills was updated successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cannot find bills with id=" + id, HttpStatus.NOT_FOUND);
        }
    }

}
