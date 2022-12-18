package controller;

import com.example.singleinvoiceapi.Repository.Bills;
import com.example.singleinvoiceapi.Repository.ItemsRepo;
import com.example.singleinvoiceapi.Repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("https://atfawry.fawrystaging.com/invoice-api/invoices/single")
public class BillsController {
    @Autowired
    RequestRepository requestRepository;

    @GetMapping("/Bills")
    public ResponseEntity<List<Bills>> getAllBills(@RequestParam(required = false) ItemsRepo itemsRepo) {
        try {
            List<Bills> bills = new ArrayList<Bills>();
            if (itemsRepo == null)
                requestRepository.findAll().forEach(bills::add);
            else
                requestRepository.findByItems(itemsRepo).forEach(bills::add);
            if (bills.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(bills, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }  @GetMapping("/Bills/{id}")
    public ResponseEntity<Bills> getBillsById(@PathVariable("id") long id) {
        Bills bills = requestRepository.findById(id);

        if (bills != null) {
            return new ResponseEntity<>(bills, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/Bills")
    public ResponseEntity<String> createBills(@RequestBody Bills bills) {
        try {
            requestRepository.save(new Bills
                    (bills.getCustomer_name(), bills.getCustomer_mobil(), bills.getCustomer_email(),
                            bills.getAmount(),bills.getSENDING_DATE(),bills.getEXPIRY_DATE(), bills.getRELEASE_DATE(),bills.getBUSINESS_REFERENCE()
                            ,bills.getNOTE(),bills.getItemsRepo(),bills.getALERTMERCHANTUPON_EXPIRY(),bills.getCOMMUNICATION_METHOD(),
                            bills.getCOMMUNICATION_LANG(),bills.getPAYMENT_TYPE(),false));
            return new ResponseEntity<>("Bills was created successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




    @PutMapping("/Bills/{id}")
    public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody Bills bills) {
        Bills bills1 = requestRepository.findById(id);

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
            requestRepository.update(bills1);
            return new ResponseEntity<>("Bills was updated successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cannot find bills with id=" + id, HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/Bills/{id}")
    public ResponseEntity<String> deleteBills(@PathVariable("id") long id) {
        try {
            int result = requestRepository.deleteById(id);
            if (result == 0) {
                return new ResponseEntity<>("Cannot find bills with id=" + id, HttpStatus.OK);
            }
            return new ResponseEntity<>("Bills was deleted successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Cannot delete bills.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/Bills")
    public ResponseEntity<String> deleteAllBills() {
        try {
            int numRows = requestRepository.deleteAll();
            return new ResponseEntity<>("Deleted " + numRows + " Bills(s) successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Cannot delete billss.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}