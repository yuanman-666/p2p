package com.lzy.manager.prc;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import com.lzy.api.ProductApi;
import com.lzy.manager.service.ProductService;
import com.lzy.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/1 20:52
 * @modified By:
 */
@AutoJsonRpcServiceImpl
@Service
public class ProductServiceImpl implements ProductApi {

    @Autowired
    ProductService productService ;

    @Override
    public List<Product> query() {
        return productService.findAll();
    }

    @Override
    public List<Product> findRpcAll(){
        return productService.findRpcAll();
    }

    @Override
    public String a() {
        return "abc";
    }
}
