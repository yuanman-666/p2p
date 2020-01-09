package com.lzy.saller.controller;

import com.lzy.pojo.Product;
import com.lzy.saller.service.ProductService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/2 8:34
 * @modified By:
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    public ProductService productService ;

    @RequestMapping("findAll")
    public List<Product> query(){
        return productService.findAll();
    }

    @RequestMapping("a")
    public String a(String id){
        return productService.a(id);
    }

    @RequestMapping("findOne")
    public Product findOne(String id){
        return productService.findOne(id);
    }

    @RequestMapping("add")
    public void add() {
        List<Product> list = productService.findAll();
        for (Product product : list) {
            productService.addeache(product);
        }
    }
}
