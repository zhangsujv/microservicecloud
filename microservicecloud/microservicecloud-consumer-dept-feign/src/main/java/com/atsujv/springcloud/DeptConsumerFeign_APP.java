package com.atsujv.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 16:25
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.atsujv.springcloud"})
public class DeptConsumerFeign_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_APP.class,args);
    }
}
