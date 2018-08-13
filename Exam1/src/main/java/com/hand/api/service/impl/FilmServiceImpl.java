package com.hand.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.domain.entity.Page;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: TestSpringBoot
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-08 23:37
 **/
@Service
public class FilmServiceImpl extends BaseServiceImpl<Film,FilmMapper> implements FilmService {
    @Override
    public List<Film> listASC(Page page) {
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getPageSize());
        }
        return mapper.selectAll();
    }
}
