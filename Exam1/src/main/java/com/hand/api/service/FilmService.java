package com.hand.api.service;

import com.hand.domain.entity.Film;
import com.hand.domain.entity.Page;

import java.util.List;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 14:22
 **/
public interface FilmService extends BaseService<Film> {
    List<Film> listASC(Page page);
}
