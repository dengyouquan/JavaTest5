package com.hand.api.controller;

import ch.qos.logback.classic.Logger;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.domain.entity.Page;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Program: TestSpringBoot
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-09 15:26
 **/
@RestController
@RequestMapping("/api/films")
public class FilmController {
    private Logger logger = (Logger) LoggerFactory.getLogger(FilmController.class);

    @Autowired
    private FilmService filmService;

    @GetMapping
    //public List<Film> list(Page page){
    public List<Film> list(@RequestParam(value = "pageSize") int pageSize,
                           @RequestParam(value = "page") int page) {
        Page p = new Page(pageSize, page);
        List<Film> films = filmService.listASC(p);
        logger.info(films.toString());
        return films;
    }
}
