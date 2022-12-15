package com.example.singleinvoiceapi.Repository;

public interface RequestRepository {
    int save();

    int update();

     findById(Long id);

    int deleteById(Long id);

    List<Tutorial> findAll();

    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

    int deleteAll();

}
