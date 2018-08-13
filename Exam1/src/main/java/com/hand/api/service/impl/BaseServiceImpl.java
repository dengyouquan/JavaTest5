package com.hand.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.api.service.BaseService;
import com.hand.domain.entity.BaseEntity;
import com.hand.domain.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 14:20
 **/
@Transactional
public abstract class BaseServiceImpl<K extends BaseEntity, T extends Mapper> implements BaseService<K> {

    @Autowired
    protected T mapper;

    @Override
    public K save(K k) {
        mapper.insert(k);
        return (K) mapper.selectByPrimaryKey(k);
    }

    @Override
    public K update(K k) {
        mapper.updateByPrimaryKey(k);
        return (K) mapper.selectByPrimaryKey(k);
    }

    @Override
    public void deleteById(Short id) {
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public K getById(Short id) {
        return (K) mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<K> getAll(Page page) {
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getPageSize());
        }
        return mapper.selectAll();
    }
}
