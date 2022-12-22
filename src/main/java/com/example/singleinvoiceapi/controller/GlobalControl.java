package com.example.singleinvoiceapi.controller;

import com.example.singleinvoiceapi.Repository.Bills;
import com.example.singleinvoiceapi.Repository.ItemsRepo;
import com.example.singleinvoiceapi.Repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GlobalControl {
    @Autowired
    RequestRepository requestRepository;
    @GetMapping("/Global/allBills")
    public ResponseEntity<List<Bills>> getAllBills(){
        List<BillsController> billsList = getAllBills().stream.map
    }
}
