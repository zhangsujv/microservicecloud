package com.atsujv.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ZhangSujv
 * @date 2018/12/13 - 21:22
 */
@SpringBootApplication
@EnableZuulProxy
public class Microservicecloudzuul9527_APP {
    public static void main(String[] args) {
        SpringApplication.run(Microservicecloudzuul9527_APP.class,args);
    }
}
