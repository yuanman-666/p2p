package com.lzy.saller.configuration;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import com.lzy.api.ProductApi;
import com.lzy.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/2 8:25
 * @modified By:
 */
@Configuration
@ComponentScan(basePackageClasses = ProductApi.class)
public class RpcConfiguration {

    @Bean
    public AutoJsonRpcClientProxyCreator autoJsonRpcClientProxyCreator(@Value("${rpc.client.url}")String url){
        AutoJsonRpcClientProxyCreator creator = new AutoJsonRpcClientProxyCreator();
        try {
            creator.setBaseUrl(new URL(url));
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        creator.setScanPackage(ProductApi.class.getPackage().getName());
        return creator ;
    }
}
