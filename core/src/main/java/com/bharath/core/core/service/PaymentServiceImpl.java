package com.bharath.core.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.core.core.dao.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService {
    
    @Autowired
    private PaymentDAO dao;

    public PaymentDAO getDao() {
        return dao;
    }

    public void setDao(PaymentDAO dao) {
        this.dao = dao;
    }
}
