package com.lzy.manager.service;

import com.lzy.manager.dao.ProductDao;
import com.lzy.pojo.Product;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2019/12/31 16:20
 * @modified By:
 */
@Service
public class ProductService {

    @Autowired
    private ProductDao productDao ;

    @Autowired
    private AmqpTemplate amqpTemplate ;


    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    public String upstatus(String id,String status) {
        try {
            productDao.upStatus(id,status);
            if("IN_SELL".equals(status)){
                System.out.println("123");
            }else{
                amqpTemplate.convertAndSend("delProductId",id);
            }
            return "成功";
        }catch (Exception e){
            System.out.println("错误");
            e.printStackTrace();
        }
        return "失败" ;
    }

    public List<Product> findRpcAll(){
        return productDao.findByAll();
    }
}
