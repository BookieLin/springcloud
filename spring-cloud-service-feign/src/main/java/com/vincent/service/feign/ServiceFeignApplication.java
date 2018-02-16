package com.vincent.service.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author:vincent
 * @Description:
 * @Date:Create in 下午 4:05 2018/2/10 0010
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class,args);
    }
}
