package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author linyi
 * @date 2022/8/9
 * 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayMentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8004.class, args);
    }
}
