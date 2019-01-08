package com.atsujv.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 16:25
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerHystrixdashboard_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixdashboard_APP.class,args);
    }
}
