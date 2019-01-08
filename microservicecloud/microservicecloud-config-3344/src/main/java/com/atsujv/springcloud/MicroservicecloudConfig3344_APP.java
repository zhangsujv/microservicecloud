package com.atsujv.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * @author ZhangSujv
 * @date 2018/12/14 - 19:34
 */
@SpringBootApplication
@EnableConfigServer
public class MicroservicecloudConfig3344_APP {
    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfig3344_APP.class,args);
    }
}
