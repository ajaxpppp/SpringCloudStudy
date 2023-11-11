package com.shenjun.springcloud.service;

import com.shenjun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment Payment);

    public Payment getPaymentById(@Param("id") Long id);
}
