package com.atsujv.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ZhangSujv
 * @date 2018/12/7 - 21:12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer dept_id;//部门id
    private String dept_name;//部门名称
    private String db_source;//对应的数据存入了哪个数据库
}
