package com.vincent.spring.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author:vincent
 * @Description:
 * @Date:Create in 下午 2:33 2018/2/9 0009
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaclientApplication {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    private String home(@RequestParam String name){
        return "hi"+name+" i am from port: "+port;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class,args);
    }
}
