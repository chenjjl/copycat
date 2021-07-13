package com.chen.rpc.controller;

import com.chen.rpc.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/consumer/simple")
public class SimpleConsumerController {

    @Value("${zookeeper.address}")
    private String zookeeperAddress;

    @Autowired
    SimpleService simpleService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public int doSomething(
            @RequestParam("num")int num
    ){
        return simpleService.doSomething(num);
        // RpcProxy rpcProxy = new RpcProxy(zookeeperAddress);
        // SimpleService simpleService = rpcProxy.create(SimpleService.class);
        // return simpleService.doSomething(num);
    }
}