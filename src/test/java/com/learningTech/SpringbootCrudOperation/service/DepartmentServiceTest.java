package com.learningTech.SpringbootCrudOperation.service;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;

    @BeforeEach
    void setUp() {
    }
    @Test
    public void whenValidDepartmentName_Thendepartmentshouldfound(){
        String departmentName = "IT";
        Department01 found = departmentService.getDetailsByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }

}