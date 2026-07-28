package com.ridhi.paytm.controller;

import com.ridhi.paytm.entity.Paytm;
import com.ridhi.paytm.service.PaytmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/paytm")
public class PaytmController {

    @Autowired
    private PaytmService service;

    @PostMapping("/payment")
    public String payment(@RequestBody Paytm payment) {
        System.out.println(payment.toString());
        return service.payment(payment);

    }
}