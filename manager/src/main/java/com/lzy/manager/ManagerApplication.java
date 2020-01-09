package com.lzy.manager;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2019/12/31 16:23
 * @modified By:
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.lzy.pojo"})
public class ManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class,args);
    }
}
