package com.ridhi.swiggy.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.ridhi.swiggy.service.SwiggyService;
import com.ridhi.swiggy.entity.User;
@RestController
public class SwiggyController {
    @Autowired
    private final SwiggyService swiggyService;

    public SwiggyController(SwiggyService swiggyService) {
        this.swiggyService = swiggyService;
    }

    @PostMapping("/orderplace")
    public String placeOrder(@RequestBody User user) {
        return swiggyService.placeOrder(user);
    }
}
