package com.hand.api.service;

import com.hand.domain.entity.Customer;
import com.hand.domain.entity.Film;
import org.apache.ibatis.annotations.Select;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 14:22
 **/
public interface CustomerService extends BaseService<Customer> {
    int getCustomerByName(String firstName, String lastName);
    Short findIdByAddress(String address);
}
