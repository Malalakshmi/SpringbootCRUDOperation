package com.learningTech.SpringbootCrudOperation.service;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import com.learningTech.SpringbootCrudOperation.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp(){
        Department01 department = Department01.builder()
                .departmentId(1L)
                .departmentName("IT")
                .departmentLocation("Hyderabad")
                .departmentBranch("gachibouli").build();
        Mockito.when(departmentRepository.findByDepartmentName("IT")).thenReturn(department);
    }
    @Test
    @DisplayName("get data based on valid name")
    public void whenValidDepartmentName_thenDepartmentShouldReturn(){
        String departmentName = "IT";
        Department01 found = departmentService.getDetailsByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }


}