package com.atsujv.springcloud.service;

import com.atsujv.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ZhangSujv
 * @date 2018/12/13 - 17:00
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Integer id) {
                return new Dept().setDept_id(id).setDept_name("id为"+id+"的部门查询不到，该访问端口的服务暂时关闭").setDb_source("数据库中没有这条数据");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
