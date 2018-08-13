package com.hand.infra.mapper;

import com.hand.domain.entity.Customer;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.Map;

public interface CustomerMapper extends Mapper<Customer> {
    @Select("select count(*) from customer c where c.first_name=#{firstName} and last_name=#{lastName}")
    int getCustomerByName(Map<String,String> map);
    @Select("select address_id from address a where a.address=#{address}")
    Short findIdByAddress(String address);
}
