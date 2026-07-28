package com.ridhi.paytm.service;

import com.ridhi.paytm.entity.Paytm;
import com.ridhi.paytm.repository.PaytmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaytmService {

    @Autowired
    private PaytmRepository repository;

    public String payment(Paytm payment) {

        payment.setSuccess(true);
        payment.setId(0);


        Random x = new Random();
        int n = x.nextInt(100,10000);

        payment.setTransactionId(String.valueOf(n));

        repository.save(payment);

        return "Payment success";
    }
}