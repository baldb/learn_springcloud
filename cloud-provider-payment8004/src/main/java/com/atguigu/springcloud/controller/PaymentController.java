package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author linyi
 * @date 2022/8/9
 * 1.0
 */
@RestController
public class PaymentController {
    @Value("${server.port}")        //获取端口号
    private String serverPort;

    @GetMapping("/payment/zk")
    private String paymentZk(){
        return "SpringCloud whit zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
