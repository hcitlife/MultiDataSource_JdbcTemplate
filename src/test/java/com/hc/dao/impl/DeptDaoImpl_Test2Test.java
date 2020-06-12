package com.hc.dao.impl;

import com.hc.dao.DeptDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DeptDaoImpl_Test2Test {

    @Resource(name = "deptDaoImplTest2")
    private DeptDao deptDao;

    @Test
    void selectAll() {
        deptDao.selectAll().forEach(System.out::println);
    }
}