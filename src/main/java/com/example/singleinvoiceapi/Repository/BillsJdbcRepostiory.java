package com.example.singleinvoiceapi.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.IncorrectResultSetColumnCountException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BillsJdbcRepostiory implements RequestRepository<Bills>{
    @Autowired
    private JdbcTemplate jdbcTemplate ;


    @Override
    public int update(Bills bills) {
        return jdbcTemplate.update("UPDATE   BILLS_FAWRY SET CUST_NAME = ?,CUST_EMAIL = ?,CUST_MOBILE = ? , amount = ? , SENDING_DATE = ? ,  EXPIRY_DATE = ? , RELEASE_DATE = ?,BUSINESS_REFERENCE = ? ,NOTE = ? ,  COMMUNICATION_LANG = ? , COMMUNICATION_METHOD = ?,items = ? ,ALERTMERCHANTUPON_EXPIRY = ?,PAYMENT_TYPE = ? , FAWRY_REEF = ? WHERE id = ?",
                new Object[]{bills.getCustomer_name(),bills.getCustomer_email(),bills.getCustomer_mobil(),bills.getAmount(),bills.getSENDING_DATE(),bills.getEXPIRY_DATE()
                        ,bills.getRELEASE_DATE(),bills.getBUSINESS_REFERENCE(),bills.getNOTE(),
                        bills.getCOMMUNICATION_LANG(),bills.getCOMMUNICATION_METHOD(),bills.getItemsRepo(),bills.getALERTMERCHANTUPON_EXPIRY(),bills.getPAYMENT_TYPE() , bills.getId() , bills.getFAWRY_REEF()});
    }

    @Override
    public int save(Bills bills) {
        return jdbcTemplate.update("INSERT INTO   BILLS_FAWRY(ID,CUST_NAME,CUST_EMAIL,CUST_MOBILE , amount , SENDING_DATE ,  EXPIRY_DATE , RELEASE_DATE,BUSINESS_REFERENCE,NOTE ,  COMMUNICATION_LANG , COMMUNICATION_METHOD,ALERTMERCHANTUPON_EXPIRY,PAYMENT_TYPE) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?) ",
                new Object[]{bills.getId(),bills.getCustomer_name(),bills.getCustomer_email(),bills.getCustomer_mobil(),bills.getAmount(),bills.getSENDING_DATE(),bills.getEXPIRY_DATE()
                        ,bills.getRELEASE_DATE(),bills.getBUSINESS_REFERENCE(),bills.getNOTE(),
                        bills.getCOMMUNICATION_LANG(),bills.getCOMMUNICATION_METHOD(),bills.getALERTMERCHANTUPON_EXPIRY(),bills.getPAYMENT_TYPE()});
    }

    @Override
    public Bills findById(Long id) {
        try {
            Bills bills = jdbcTemplate.queryForObject("SELECT * FROM BILLS_FAWRY WHERE id = ?" ,
                    BeanPropertyRowMapper.newInstance(Bills.class), id);
            return bills;
        }catch (IncorrectResultSetColumnCountException e){
            e.printStackTrace();
            return  null ;
        }

    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("DELETE FROM BILLS_FAWRY WHERE id=?", id);
    }

    @Override
    public List<Bills> findAll() {
        return jdbcTemplate.query("SELECT * from BILLS_FAWRY ", BeanPropertyRowMapper.newInstance(Bills.class));
    }

    @Override
    public int deleteAll() {
        return jdbcTemplate.update("DELETE from BILLS_FAWRY");
    }

    @Override
    public List<Bills> findByItems(ItemsRepo itemsRepo) {
        return null;
    }

    @Override
    public List<ItemsRepo> findByBill(Long id) {
        return null;
    }

}
