package com.atsujv.springcloud.controller;

import com.atsujv.springcloud.entities.Dept;
import com.atsujv.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 11:08
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "errorMethod")
    public Dept get(@PathVariable("id") Integer id){
        Dept dept = deptService.get(id);
        if(dept == null){
            throw new RuntimeException("没有Id为"+id+"的部门");
        }
        return deptService.get(id);
    }
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }

    @GetMapping(value = "/dept/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("************"+services);
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()
            +"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    public Dept errorMethod(@PathVariable("id") Integer id){
        Dept dept = new Dept();
        dept.setDept_id(id).setDept_name("没有dept_id为"+id+"的部门").setDb_source("数据库没有该数据");
        return dept;
    }
}
