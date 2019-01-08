package com.atsujv.springcloud.service;

import com.atsujv.springcloud.entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 10:57
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Integer id);
    public List<Dept> list();
}
