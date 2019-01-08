package com.atsujv.springcloud.configClientRest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangSujv
 * @date 2018/12/14 - 20:27
 */
@RestController
public class ConfigclientRest {
    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String serverPort;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @GetMapping(value = "/config")
    public String getConfig(){
        String str = "applicationName:"+appName+"\t eurekaServers:"+eurekaServers+"\t serverPort:"+serverPort;
        System.out.println("**************"+str);
        return str;
    }
}
