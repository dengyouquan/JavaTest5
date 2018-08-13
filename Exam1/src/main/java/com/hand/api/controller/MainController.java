package com.hand.api.controller;

import com.hand.api.service.CustomerService;
import com.hand.domain.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 14:49
 **/
@Controller
public class MainController {
    private static final String LOGIN_SUCCESS = "login success";
    private static final String LOGIN_FAIL = "login fail";

    @Autowired
    private CustomerService customerService;

    @ResponseBody
    @PostMapping("/login")
    public String login(@RequestParam(value = "name") String name,
                        @RequestParam(value = "password") String password) {
        int count = customerService.getCustomerByName(name, password);
        System.out.println(count);
        return count != 0 ? LOGIN_SUCCESS : LOGIN_FAIL;
    }
}
