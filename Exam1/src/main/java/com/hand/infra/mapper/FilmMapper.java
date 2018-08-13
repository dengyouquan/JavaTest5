package com.hand.infra.mapper;

import com.hand.domain.entity.Film;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface FilmMapper extends Mapper<Film> {
    @Select("select * from film order by film_id ASC")
    List<Film> listASC();
}