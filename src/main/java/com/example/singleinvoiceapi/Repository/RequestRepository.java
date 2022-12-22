package com.example.singleinvoiceapi.Repository;

import java.util.List;

public interface RequestRepository<T> {

    int update(T t);
    int save(T t);
    T findById(Long id);

    int deleteById(Long id);

    List<T> findAll();
    int deleteAll();
    List<Bills> findByItems(ItemsRepo itemsRepo);
List<ItemsRepo> findByBill(Long id);

}
