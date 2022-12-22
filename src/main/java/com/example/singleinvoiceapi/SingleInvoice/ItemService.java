package com.example.singleinvoiceapi.SingleInvoice;

import com.example.singleinvoiceapi.Repository.ItemsJdbcRepository;
import com.example.singleinvoiceapi.Repository.ItemsRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class ItemService {
    ItemsJdbcRepository itemsJdbcRepository ;
    public ResponseEntity<String> createItems(@RequestBody ItemsRepo itemsRepo) {
        try {
            itemsJdbcRepository.save(itemsRepo);
            return new ResponseEntity<>("Items was created successfully.", HttpStatus.CREATED);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
}
