package com.atsujv.springcloud.controller;

import com.atsujv.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 16:03
 */
@RestController
public class DeptController_consumer {
    private static String REST_URL_PERFIX = "http://MICROSERVICECLOUD-DEPT/";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PERFIX+"dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PERFIX+"dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PERFIX+"dept/list",List.class);
    }

    @GetMapping(value = "/consumer/dept/discovery")
    public Object discoverry(){
        return restTemplate.getForObject(REST_URL_PERFIX+"dept/discovery",Object.class);
    }
}
