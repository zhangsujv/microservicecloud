package com.atsujv.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 19:37
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_APP.class,args);
    }
}
