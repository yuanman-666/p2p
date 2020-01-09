package com.lzy.manager.controller;

import com.lzy.manager.service.ProductService;
import com.lzy.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2019/12/31 16:20
 * @modified By:
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService ;


    @RequestMapping("findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }


    @RequestMapping("/status")
    public String upstatus(String id,String status){
        String msg  = productService.upstatus(id,status);
        return msg ;
    }

    @RequestMapping("add")
    public String add(@RequestBody Product product){
        System.out.println(product.getName());
        //分支1
        return "添加成功";
    }
}
