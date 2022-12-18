package com.example.singleinvoiceapi.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.IncorrectResultSetColumnCountException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BillsJdbcRepostiory implements RequestRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate ;



    @Override
    public int save(Bills bills) {
        return jdbcTemplate.update("INSERT INTO  Bills (Customer_name,Customer_email,Customer_mobil , amount , SENDING_DATE ,  EXPIRY_DATE , RELEASE_DATE,BUSINESS_REFERENCE,NOTE ,  COMMUNICATION_LANG , COMMUNICATION_METHOD,itemsRepo,ALERTMERCHANTUPON_EXPIRY,PAYMENT_TYPE)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?) ",
                new Object[]{bills.getCustomer_name(),bills.getCustomer_email(),bills.getCustomer_mobil(),bills.getAmount(),bills.getSENDING_DATE(),bills.getEXPIRY_DATE()
                        ,bills.getRELEASE_DATE(),bills.getBUSINESS_REFERENCE(),bills.getNOTE(),
                        bills.getCOMMUNICATION_LANG(),bills.getCOMMUNICATION_METHOD(),bills.getItemsRepo(),bills.getALERTMERCHANTUPON_EXPIRY(),bills.getPAYMENT_TYPE()});
    }



    @Override
    public int update(Bills bills) {
        return jdbcTemplate.update("UPDATE  Bills SET Customer_name = ?,Customer_email = ?,Customer_mobil = ? , amount = ? , SENDING_DATE = ? ,  EXPIRY_DATE = ? , RELEASE_DATE = ?,BUSINESS_REFERENCE = ? ,NOTE = ? ,  COMMUNICATION_LANG = ? , COMMUNICATION_METHOD = ?,itemsRepo = ? ,ALERTMERCHANTUPON_EXPIRY = ?,PAYMENT_TYPE = ? WHERE id = ?",
                new Object[]{bills.getCustomer_name(),bills.getCustomer_email(),bills.getCustomer_mobil(),bills.getAmount(),bills.getSENDING_DATE(),bills.getEXPIRY_DATE()
                        ,bills.getRELEASE_DATE(),bills.getBUSINESS_REFERENCE(),bills.getNOTE(),
                        bills.getCOMMUNICATION_LANG(),bills.getCOMMUNICATION_METHOD(),bills.getItemsRepo(),bills.getALERTMERCHANTUPON_EXPIRY(),bills.getPAYMENT_TYPE() , bills.getId()});
    }

    @Override
    public Bills findById(Long id) {
        try {
            Bills bills = jdbcTemplate.queryForObject("SELECT * FROM Bills WHERE id = ?" ,
                    BeanPropertyRowMapper.newInstance(Bills.class), id);
            return bills;
        }catch (IncorrectResultSetColumnCountException e){
            return  null ;
        }

    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("DELETE FROM Bills WHERE id=?", id);
    }

    @Override
    public List<Bills> findAll() {
        return jdbcTemplate.query("SELECT * from Bills", BeanPropertyRowMapper.newInstance(Bills.class));
    }

    @Override
    public int deleteAll() {
        return jdbcTemplate.update("DELETE from Bills");
    }

    @Override
    public List<Bills> findByItems(ItemsRepo itemsRepo) {
        return jdbcTemplate.query("SELECT * from Bills WHERE ItemsRepo=?",
                BeanPropertyRowMapper.newInstance(Bills.class), itemsRepo);
    }
}
