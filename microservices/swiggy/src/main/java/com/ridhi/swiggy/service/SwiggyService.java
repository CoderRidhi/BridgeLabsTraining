package com.ridhi.swiggy.service;

import com.ridhi.swiggy.entity.User;
import com.ridhi.swiggy.repository.SwiggyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import com.ridhi.swiggy.MyFeign;

@Service
public class SwiggyService {

    @Autowired
    private SwiggyRepository repository;

    @Autowired
    private MyFeign feign;

    public String placeOrder(User user) {

        //user.setOrderSuccess(false);
        repository.save(user);
        //user.setId(0);

String x= feign.payment(user);
        if (x.startsWith("Payment")) {
            user.setOrderSuccess(true);
            repository.save(user);
            return "Order Placed Successfully";
        }


        return "Order Not Placed";
    
    }
}