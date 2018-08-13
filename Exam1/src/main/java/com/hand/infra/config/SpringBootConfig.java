package com.hand.infra.config;

import com.hand.domain.entity.Page;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 16:16
 **/
@Configuration
public class SpringBootConfig {
    @Bean
    public HandlerInterceptor handlerInterceptor(){
        return new HandlerInterceptorAdapter() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                String  pageSize = (String) request.getAttribute("pageSize");
                String page = (String) request.getAttribute("page");
                System.out.println("lanjieqipageSize:"+pageSize+","+page);
                //Page p = new Page(, )
                return true;
            }
        };
    }
}
