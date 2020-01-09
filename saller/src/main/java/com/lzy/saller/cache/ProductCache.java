package com.lzy.saller.cache;

import com.hazelcast.core.Hazelcast;
import com.lzy.api.ProductApi;
import com.lzy.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/3 10:51
 * @modified By:
 */
@Component
public class ProductCache {

    @Autowired
    private ProductApi productApi ;

    private static final String CACHE_NAME = "PRODUCT";


    @Cacheable(cacheNames = CACHE_NAME,key = "#id")
    public String  findCode(String id){
        return "" ;
    }

    @Cacheable(cacheNames = CACHE_NAME,key = "#id")
    public Product findOne(String id){
        return null ;
    }

//    @CachePut (cacheNames=CACHE_NAME,key="#对象.id") 更新用的
//    @CacheEvict 删除用的



    @CachePut(cacheNames = CACHE_NAME,key = "#product.id")
    public Product add(Product product){
        System.out.println(product.getId());
        return product;
    }

    @CacheEvict(cacheNames = CACHE_NAME,key = "#id")
    public void del(String id){
        System.out.println("....");
    }


}
