package com.hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.hand.infra.mapper")
@EnableTransactionManagement
public class JavaTest5Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaTest5Application.class, args);
    }
}
