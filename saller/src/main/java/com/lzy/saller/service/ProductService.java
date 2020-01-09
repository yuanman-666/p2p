package com.lzy.saller.service;

import com.lzy.api.ProductApi;
import com.lzy.pojo.Product;
import com.lzy.saller.cache.ProductCache;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/2 8:34
 * @modified By:
 */
@Service
public class ProductService {

    @Autowired
    ProductApi productApi ;

    @Autowired
    private ProductCache productCache ;

    public List<Product> findAll() {
        return productApi.findRpcAll();
    }

    public String a(String id) {
        return productCache.findCode(id);
    }

    @RabbitListener(queues = "delProductId")
    public void delProductId(String id){
        System.out.println(id);
        productCache.del(id);
    }

    public void addeache(Product product) {
        productCache.add(product);
    }

    public Product findOne(String id){
        return productCache.findOne(id);
    }
}
