package com.hand.api.service;

import com.hand.domain.entity.BaseEntity;
import com.hand.domain.entity.Page;

import java.util.List;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 14:20
 **/
public interface BaseService<T extends BaseEntity> {

    T save(T t);

    T update(T t);

    void deleteById(Short id);

    T getById(Short id);

    List<T> getAll(Page page);
}
