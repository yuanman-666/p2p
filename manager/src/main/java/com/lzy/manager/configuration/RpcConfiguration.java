package com.lzy.manager.configuration;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: 19353
 * @date: Created in 2020/1/1 20:59
 * @modified By:
 */
@Configuration
public class RpcConfiguration {

    @Bean
    public AutoJsonRpcServiceImplExporter autoJsonRpcServiceImplExporter(){
        return new AutoJsonRpcServiceImplExporter();
    }
}
