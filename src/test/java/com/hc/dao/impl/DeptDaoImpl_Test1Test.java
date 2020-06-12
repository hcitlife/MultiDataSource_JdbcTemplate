package com.hc.dao.impl;

import com.hc.dao.DeptDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DeptDaoImpl_Test1Test {

    @Resource(name = "deptDaoImpl_Test1")
    private DeptDao deptDao;

    @Test
    void selectAll() {
        deptDao.selectAll().forEach(System.out::println);
    }
}