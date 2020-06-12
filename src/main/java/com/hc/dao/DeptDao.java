package com.hc.dao;

import com.hc.bean.Dept;

import java.util.List;

public interface DeptDao {
    int insert(Dept dept);
    int update(Dept dept);
    int delete(Integer deptno);
    Dept selectByDeptno(Integer deptno);
    List<Dept> selectAll();
}
