package com.atsujv.springcloud.dao;

import com.atsujv.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhangSujv
 * @date 2018/12/8 - 16:48
 */
@Mapper
public interface DeptDao {
    public Boolean addDept(Dept dept);

    public Dept findDeptById(Integer id);

    public List<Dept> findAll();
}
