package com.atsujv.springcloud.service;

import com.atsujv.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author ZhangSujv
 * @date 2018/12/12 - 20:10
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();

    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept);
}
