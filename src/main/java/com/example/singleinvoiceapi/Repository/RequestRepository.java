package com.example.singleinvoiceapi.Repository;

import java.util.List;

public interface RequestRepository {


    int save(Bills bills);

    int update(Bills bills);

    Bills findById(Long id);

    int deleteById(Long id);

    List<Bills> findAll();
    int deleteAll();

    List<Bills> findByItems(ItemsRepo itemsRepo);

}
