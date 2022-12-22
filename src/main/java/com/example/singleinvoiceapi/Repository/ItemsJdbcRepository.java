package com.example.singleinvoiceapi.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.IncorrectResultSetColumnCountException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
// generic
@Repository
public class ItemsJdbcRepository implements RequestRepository<ItemsRepo>{
    @Autowired
    private JdbcTemplate jdbcTemplate ;


    @Override
    public int update(ItemsRepo itemsRepo) {
        return  jdbcTemplate.update("UPDATE SET ITEMS_FAWRY(ITEM_CODE=?, PURCHASED_QUANTITY = ?, PRICE = ?, NAMEEN = ?,NAMEAR = ?,BILLS_NUM = ? WHERE ITEMS_ID = ? ",
                new Object[]{itemsRepo.getItems_id(),itemsRepo.getITEM_CODE(),itemsRepo.getPURCHASED_QUANTITY()
                        ,itemsRepo.getPRICE(),itemsRepo.getNAMEEN(),itemsRepo.getNAMEAR(),itemsRepo.getBILLS_NUM()});
    }




    @Override
    public int save(ItemsRepo itemsRepo) {
        return  jdbcTemplate.update("INSERT INTO   ITEMS_FAWRY(ITEMS_ID,ITEM_CODE, PURCHASED_QUANTITY, PRICE, NAMEEN,NAMEAR,BILLS_NUM) values (?,?,?,?,?,?,?)",
                new Object[]{itemsRepo.getItems_id(),itemsRepo.getITEM_CODE(),itemsRepo.getPURCHASED_QUANTITY()
                        ,itemsRepo.getPRICE(),itemsRepo.getNAMEEN(),itemsRepo.getNAMEAR(),itemsRepo.getBILLS_NUM()});
    }

    @Override
    public ItemsRepo findById(Long id) {
        try {
           ItemsRepo itemsRepo =  jdbcTemplate.queryForObject("SELECT * FROM ITEMS_FAWRY WHERE ITEMS_ID = ?" ,
                   BeanPropertyRowMapper.newInstance(ItemsRepo.class),id);
           return itemsRepo ;
        }catch (IncorrectResultSetColumnCountException e){
            e.printStackTrace();
            return null ;

        }
    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("DELETE FROM ITEMS_FAWRY WHERE ITEMS_ID=?", id);
    }

    @Override
    public List<ItemsRepo> findAll() {
        return jdbcTemplate.query("SELECT * from ITEMS_FAWRY", BeanPropertyRowMapper.newInstance(ItemsRepo.class));
    }

    @Override
    public int deleteAll() {
        return jdbcTemplate.update("DELETE from  ITEMS_FAWRY");
    }

    @Override
    public List<Bills> findByItems(ItemsRepo itemsRepo) {
        return null;
    }

    @Override
    public List<ItemsRepo> findByBill(Long id) {
        return  jdbcTemplate.query("SELECT * FROM ITEMS_FAWRY WHERE BILLS_NUM = ?" ,BeanPropertyRowMapper.newInstance(ItemsRepo.class),id);
    }


}
