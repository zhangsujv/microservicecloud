package com.atsujv.springcloud;

import com.atsujv.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 16:25
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
public class DeptConsumer80_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_APP.class,args);
    }
}
