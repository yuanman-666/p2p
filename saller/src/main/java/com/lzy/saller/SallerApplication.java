package com.lzy.saller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/2 8:21
 * @modified By:
 */
@SpringBootApplication
@EnableCaching
public class SallerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SallerApplication.class,args);
    }
}
