package com.hand.api.controller;

import ch.qos.logback.classic.Logger;
import com.hand.api.dto.CustomerDTO;
import com.hand.api.service.CustomerService;
import com.hand.domain.entity.Customer;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 14:39
 **/
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private Logger logger = (Logger) LoggerFactory.getLogger(FilmController.class);

    @Autowired
    private CustomerService customerService;

    @PutMapping
    public int createCustomer(@RequestBody CustomerDTO customerDTO) {
        Short aid = customerService.findIdByAddress(customerDTO.getAddress());
        System.out.println("aid"+aid);
        Customer customer = new Customer(customerDTO);
        customer.setLastUpdate(new Date());
        customer.setStoreId((byte) 1);
        customer.setCreateDate(new Date());
        customer.setActive(true);
        customer.setAddressId(aid);
        customerService.save(customer);
        logger.info("save customer:"+customer);
        return customer.getCustomerId();
    }


    @PostMapping("/{id}")
    public Customer updateCustomer(@PathVariable("id") Short id, @RequestBody CustomerDTO customerDTO) {
        Customer oldCustomer = customerService.getById(id);
        oldCustomer.setLastUpdate(new Date());
        oldCustomer.setCustomerDTO(customerDTO);
        customerService.update(oldCustomer);
        logger.info("update customer:"+oldCustomer);
        return oldCustomer;
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Short id, HttpServletRequest httpServletRequest) {
        Cookie[] cookies = httpServletRequest.getCookies();
        Cookie cookie = cookies[0];
        Short cid = Short.parseShort(cookie.getValue());
        logger.info("delete customer:"+cid);
        customerService.deleteById(cid);
    }
}
