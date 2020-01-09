package com.lzy.api;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.lzy.pojo.Product;

import java.util.List;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/2 8:14
 * @modified By:
 */
@JsonRpcService("rpc/products")
public interface ProductApi {

    List<Product> query();

    String a();

    List<Product> findRpcAll();
}
