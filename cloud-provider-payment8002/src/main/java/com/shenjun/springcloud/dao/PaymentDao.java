package com.shenjun.springcloud.dao;


import com.shenjun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int create(Payment Payment);

    public Payment getPaymentById(@Param("id") Long id);
}
