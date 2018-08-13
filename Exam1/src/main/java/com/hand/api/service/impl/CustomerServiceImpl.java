package com.hand.api.service.impl;

import com.hand.api.service.CustomerService;
import com.hand.domain.entity.Customer;
import com.hand.infra.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 14:06
 **/
@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerMapper> implements CustomerService {
    @Override
    public int getCustomerByName(String firstName, String lastName) {
        Map<String, String> map = new HashMap<>();
        map.put("firstName", firstName);
        map.put("lastName", lastName);
        return mapper.getCustomerByName(map);
    }

    @Override
    public Short findIdByAddress(String address) {
        return mapper.findIdByAddress(address);
    }
}
