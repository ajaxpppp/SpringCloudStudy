package com.shenjun.springcloud.service.impl;

import com.shenjun.springcloud.dao.PaymentDao;
import com.shenjun.springcloud.entities.Payment;
import com.shenjun.springcloud.service.PaymentService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment Payment) {
        return paymentDao.create(Payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
