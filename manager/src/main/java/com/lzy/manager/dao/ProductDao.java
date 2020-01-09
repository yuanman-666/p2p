package com.lzy.manager.dao;

import com.lzy.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2019/12/31 16:18
 * @modified By:
 */
@Component
public interface ProductDao extends JpaRepository<Product,String>, JpaSpecificationExecutor<Product> {

    @Query(value = "update t_product set status = ?2 where id = ?1",nativeQuery = true)
    @Modifying
    public void upStatus(String id,String status);

    @Query(value = "select * from t_product where status = 'IN_SELL'",nativeQuery = true)
    public List<Product> findByAll();

}
