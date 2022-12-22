package com.example.singleinvoiceapi.controller;

import com.example.singleinvoiceapi.Repository.Bills;
import com.example.singleinvoiceapi.Repository.ItemsRepo;
import com.example.singleinvoiceapi.Repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.sun.beans.introspect.PropertyInfo.Name.required;

@RestController
@RequestMapping("/api")
public class ItemsController {

    @Autowired
    RequestRepository requestRepository;



    public ResponseEntity<List<ItemsRepo>> getAllItemsByBillId(Bills bills){
        List <ItemsRepo> itemsReposlist = new ArrayList<>();
       itemsReposlist.
        //List<String> id = details.stream.map(Item::getID).collect(Colectors.tolist())


    }






    @PostMapping(value = "/Items", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createItems(@RequestBody ItemsRepo itemsRepo) {
        try {
            requestRepository.save(itemsRepo);
            return new ResponseEntity<>("Items was created successfully.", HttpStatus.CREATED);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
    @PutMapping("/items/{id}")
    public ResponseEntity<String> updateItems(@PathVariable("id") long id, @RequestBody ItemsRepo itemsRepo) {
        ItemsRepo itemsRepo1 = (ItemsRepo) requestRepository.findById(id);
        if (itemsRepo1==null){
            itemsRepo1.setItems_id(id);
            itemsRepo1.setITEM_CODE(itemsRepo.getITEM_CODE());
            itemsRepo1.setPURCHASED_QUANTITY(itemsRepo.getPURCHASED_QUANTITY());
            itemsRepo1.setPRICE(itemsRepo.getPRICE());
            itemsRepo1.setNAMEEN(itemsRepo.getNAMEEN());
            itemsRepo1.setNAMEAR(itemsRepo.getNAMEAR());
            itemsRepo1.setBILLS_NUM(itemsRepo.getBILLS_NUM());
            requestRepository.update(itemsRepo1);
            return new ResponseEntity<>("Items was updated successfully.", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Cannot find Items with id=" + id, HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/items/{id}")
    public ResponseEntity<String> deleteitems(@PathVariable("id") long id) {
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
            return new ResponseEntity<>("Cannot delete items.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}