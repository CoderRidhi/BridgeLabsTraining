package com.ridhi.swiggy;


import com.ridhi.swiggy.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value="paytm")
public interface MyFeign {
    @PostMapping("/payment")
    public String payment(@RequestBody User user);
}