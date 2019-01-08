package com.atsujv.springcloud.service.Impl;

import com.atsujv.springcloud.dao.DeptDao;
import com.atsujv.springcloud.entities.Dept;
import com.atsujv.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 11:00
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean add(Dept dept) {
        Boolean aBoolean = deptDao.addDept(dept);
        return aBoolean;
    }

    @Override
    public Dept get(Integer id) {
        Dept dept = deptDao.findDeptById(id);
        return dept;
    }

    @Override
    public List<Dept> list() {
        List<Dept> depts = deptDao.findAll();
        return depts;
    }
}
