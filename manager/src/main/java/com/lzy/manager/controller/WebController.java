package com.lzy.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/8 18:46
 * @modified By:
 */
@Controller
public class WebController {

    @RequestMapping("to")
    public String aaa(){

        System.out.println("123");
        return "login";
    }
}
